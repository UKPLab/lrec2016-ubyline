/*******************************************************************************
 * Copyright 2012
 * Ubiquitous Knowledge Processing (UKP) Lab and FG Language Technology
 * Technische Universität Darmstadt
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.tudarmstadt.ukp.ubyline.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Type;

/**
 * A persistence object for project permission. A user can have one or multiple permissions on a
 * project. Project permissions include {@code admin}, {@code user} for (annotator) and
 * {@code curator}
 * 
 * @author Seid Muhie Yimam
 * 
 */
@Entity
@Table(name = "project_permissions", uniqueConstraints = { @UniqueConstraint(columnNames = {
        "user", "role", "project" }) })
public class ProjectPermission
    implements Serializable
{
    private static final long serialVersionUID = -1490540239189868920L;

    @Id
    @GeneratedValue
    private long id;

    @Type(type = "de.tudarmstadt.ukp.ubyline.model.ProjectRoleType")
    private ProjectRole role;

    private String user;

    @ManyToOne
    @JoinColumn(name = "project")
    private Project project;

    public long getId()
    {
        return id;
    }

    public void setId(long aId)
    {
        id = aId;
    }

    public ProjectRole getRole()
    {
        return role;
    }

    public void setRole(ProjectRole aRole)
    {
        role = aRole;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String aUser)
    {
        user = aUser;
    }

    public Project getProject()
    {
        return project;
    }

    public void setProject(Project aProject)
    {
        project = aProject;
    }
}
