package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/** Объект тикета (POJO) */
public class Ticket {

    // todo: serialized поля, геттеры и сеттеры

    @SerializedName("queue")
    private Integer queue;
    public void setQueue(Integer queue) {
        this.queue = queue;
    }
    public Integer getQueue() {
        return queue;
    }

    @SerializedName("title")
    private  String title;
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @SerializedName("priority")
    private Integer priority;
    public Integer getPriority() {
        return priority;
    }
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @SerializedName("status")
    private Integer status;
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }



    @JsonIgnore
    private Integer id;
    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    @JsonIgnore
        private String due_date;
        public String getDue_date() {
            return due_date;
        }
        public void setDue_date(String due_date) {     this.due_date = due_date;
        }
    @JsonIgnore
    private String description;
    public String getDescription() {
       return description;
    }
   public void setDescription(String description) {
       this.description = description;
   }

    @JsonIgnore
    private String submitter_email;
   public String getSubmitter_email() {
       return submitter_email;
   }
   public void setSubmitter_email(String submitter_email) {
       this.submitter_email = submitter_email;
   }

    @JsonIgnore
    private String assigned_to;
    @JsonIgnore
    private String created;
    @JsonIgnore
    private String modified;
  //
  @JsonIgnore
    private Boolean  on_hold;
    public Boolean getOn_hold() {
        return on_hold;
    }
    public void setOn_hold(Boolean on_hold) {
        this.on_hold = on_hold;
    }

    //
  @JsonIgnore
    private String resolution;
    @JsonIgnore
    private String last_escalation;
    @JsonIgnore
    private String secret_key;
    @JsonIgnore
    private Integer kbitem;
    @JsonIgnore
    private Integer merged_to;

    public String getAssigned_to() {
        return assigned_to;
    }
    public void setAssigned_to(String assigned_to) {this.assigned_to = assigned_to;
    }
    public void setCreated(String created) {
        this.created = created;
    }
    public String getCreated() {
        return created;
    }
    public String getModified() {
        return modified;
    }
    public void setModified(String modified) {
        this.modified = modified;
    }


    public String getResolution() {
        return resolution;
    }
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public String getLast_escalation() {
        return last_escalation;
    }
    public void setLast_escalation(String last_escalation) {
        this.last_escalation = last_escalation;
    }
    public String getSecret_key() {
        return secret_key;
    }
    public void setSecret_key(String secret_key) {
        this.secret_key = secret_key;
    }
    public Integer getKbitem() {
        return kbitem;
    }
    public void setKbitem(Integer kbitem) {
        this.kbitem = kbitem;
    }
    public Integer getMerged_to() {
        return merged_to;
    }
    public void setMerged_to(Integer merged_to) {
        this.merged_to = merged_to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return title.equals(ticket.title) &&
                queue.equals(ticket.queue) &&
                Objects.equals(status, ticket.status) &&
                Objects.equals(priority, ticket.priority) &&
                Objects.equals(description, ticket.description) &&
                Objects.equals(due_date, ticket.due_date) &&
                Objects.equals(submitter_email, ticket.submitter_email) &&
                Objects.equals(kbitem, ticket.kbitem);

    }

    @Override
    public int hashCode() {
        return Objects.hash(title, queue, status, priority, description, due_date, submitter_email, kbitem);
    }

    }