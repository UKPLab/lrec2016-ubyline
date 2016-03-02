package de.tudarmstadt.ukp.ubyline.page.annotation;

import java.io.Serializable;
import java.util.Date;

public class Item
    implements Serializable
{
    private static final long serialVersionUID = -3423788670121566877L;
    
    private long id;
    private String type;
    private String text;
    private String instanceId;
    private String documentId;
    private String corpusId;    
    private int beginOff;
    private int endOff;
    private String senseExternalId;
    private int beginMatch;
    private int endMatch;
    private Date date;
    
    

    public Item(long id, String type, String text, String color,String documentId, String corpusId, 
            int beginOff, int endOff, String senseExternalId, int beginMatch, int endMatch,Date date)
    {
        super();
        this.id = id;
        this.type = type;
        this.instanceId = color;
        this.text = text;
        this.documentId = documentId;
        this.corpusId = corpusId;        
        this.beginOff = beginOff;
        this.endOff = endOff;
        this.senseExternalId = senseExternalId;
        this.setBeginMatch(beginMatch);
        this.setEndMatch(endMatch);
        this.setDate(date);
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getInstanceId()
    {
        return instanceId;
    }

    public void setInstanceId(String instanceId)
    {
        this.instanceId = instanceId;
    }

    public String getCorpusId()
    {
        return corpusId;
    }

    public void setCorpusId(String corpusId)
    {
        this.corpusId = corpusId;    }

    

    public int getBeginOff()
    {
        return beginOff;
    }

    public void setBeginOff(int beginOff)
    {
        this.beginOff = beginOff;
    }

    public int getEndOff()
    {
        return endOff;
    }

    public void setEndOff(int endOff)
    {
        this.endOff = endOff;
    }

    public String getDocumentId()
    {
        return documentId;
    }

    public void setDocumentId(String documentId)
    {
        this.documentId = documentId;
    }

    public String getSenseExternalId()
    {
        return senseExternalId;
    }

    public void setSenseExternalId(String senseExternalId)
    {
        this.senseExternalId = senseExternalId;
    }

    public int getBeginMatch()
    {
        return beginMatch;
    }

    public void setBeginMatch(int beginMatch)
    {
        this.beginMatch = beginMatch;
    }

    public int getEndMatch()
    {
        return endMatch;
    }

    public void setEndMatch(int endMatch)
    {
        this.endMatch = endMatch;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return 
            "("+this.id+","+ this.type+","+ this.text+","+ this.instanceId+","+this.documentId+","+ this.corpusId+","+ this.beginOff+","+this.endOff+","+this.senseExternalId+","+this.beginMatch+","+ this.endMatch+")";
        
    }
    

}
