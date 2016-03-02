package de.tudarmstadt.ukp.ubyline.page.annotation;

import static java.util.Arrays.asList;
import static org.apache.uima.fit.factory.AnalysisEngineFactory.createEngine;
import static org.apache.uima.fit.util.JCasUtil.select;
import static org.apache.uima.fit.util.JCasUtil.toText;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.jcas.JCas;
import org.junit.Test;

import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Token;
import de.tudarmstadt.ukp.dkpro.core.tokit.PatternBasedTokenSegmenter;
public class PatternBasedTokenSegmenterTest
{

    private static final String[] PATTERNS = new String[] {
        PatternBasedTokenSegmenter.INCLUDE_PREFIX + "[0-9]+",
        PatternBasedTokenSegmenter.EXCLUDE_PREFIX + "[\\/?!&%\"'#<>_=.“„:;\\s]+" };

@Test
public void testProcess()
    throws Exception
{
    AnalysisEngine seg = createEngine(PatternBasedTokenSegmenter.class,
            PatternBasedTokenSegmenter.PARAM_PATTERNS, PATTERNS);

    // 01234567890123456789012345    || 
    String content = "stammt und ''Menschenfresser''";
    JCas cas = seg.newJCas(); 
    cas.setDocumentText(content);
    new Token(cas, 0, 13).addToIndexes();
    new Token(cas, 13, content.length()).addToIndexes();

    seg.process(cas);

    List<String> ref = asList("stammt", "und", "Menschenfresser");
    List<String> tokens = toText(select(cas, Token.class));
    System.out.println(tokens);
    assertEquals(ref, tokens);
}

}
