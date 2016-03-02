package de.tudarmstadt.ukp.ubyline.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "user_log")
public class UserLog implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;
    
    @Column(name = "date", nullable = false)
    private Date date;
    
    @ManyToOne
    @JoinColumn(name = "project", nullable = false)
    private Project project;
    
    @Column(nullable = false)
    private String username;

    @Column(name = "action", nullable = false)
    private String action;

    @Column(name = "target", nullable = false)
    private String target;

    
    public UserLog()
    {
        // TODO Auto-generated constructor stub
    }


    public long getId()
    {
        return id;
    }


    public void setId(long id)
    {
        this.id = id;
    }


    public Date getDate()
    {
        return date;
    }


    public void setDate(Date date)
    {
        this.date = date;
    }


    public Project getProject()
    {
        return project;
    }


    public void setProject(Project project)
    {
        this.project = project;
    }


    public String getUsername()
    {
        return username;
    }


    public void setUsername(String username)
    {
        this.username = username;
    }


    public String getAction()
    {
        return action;
    }


    public void setAction(String action)
    {
        this.action = action;
    }


    public String getTarget()
    {
        return target;
    }


    public void setTarget(String target)
    {
        this.target = target;
    }


    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((username == null) ? 0 : username.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserLog other = (UserLog) obj;
        if (date == null) {
            if (other.date != null)
                return false;
        }
        else if (!date.equals(other.date))
            return false;
        if (username == null) {
            if (other.username != null)
                return false;
        }
        else if (!username.equals(other.username))
            return false;
        return true;
    }



}
