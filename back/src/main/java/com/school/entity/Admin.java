package com.school.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * admin
 * @author 
 */
@Data
public class Admin implements Serializable {
    private Integer idAdmin;

    private String adminAccount;

    private String adminPassword;

    private String adminName;

    private Date adminRegTime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Admin other = (Admin) that;
        return (this.getIdAdmin() == null ? other.getIdAdmin() == null : this.getIdAdmin().equals(other.getIdAdmin()))
            && (this.getAdminAccount() == null ? other.getAdminAccount() == null : this.getAdminAccount().equals(other.getAdminAccount()))
            && (this.getAdminPassword() == null ? other.getAdminPassword() == null : this.getAdminPassword().equals(other.getAdminPassword()))
            && (this.getAdminName() == null ? other.getAdminName() == null : this.getAdminName().equals(other.getAdminName()))
            && (this.getAdminRegTime() == null ? other.getAdminRegTime() == null : this.getAdminRegTime().equals(other.getAdminRegTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIdAdmin() == null) ? 0 : getIdAdmin().hashCode());
        result = prime * result + ((getAdminAccount() == null) ? 0 : getAdminAccount().hashCode());
        result = prime * result + ((getAdminPassword() == null) ? 0 : getAdminPassword().hashCode());
        result = prime * result + ((getAdminName() == null) ? 0 : getAdminName().hashCode());
        result = prime * result + ((getAdminRegTime() == null) ? 0 : getAdminRegTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", idAdmin=").append(idAdmin);
        sb.append(", adminAccount=").append(adminAccount);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", adminName=").append(adminName);
        sb.append(", adminRegTime=").append(adminRegTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}