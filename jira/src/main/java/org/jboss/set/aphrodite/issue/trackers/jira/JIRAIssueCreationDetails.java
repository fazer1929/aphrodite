/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2020, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.set.aphrodite.issue.trackers.jira;

import org.jboss.set.aphrodite.issue.trackers.common.IssueCreationDetails;;

/**
 * JIRA specific fields.
 *
 * @author baranowb
 *
 */
public class JIRAIssueCreationDetails extends IssueCreationDetails {

    //type of issue, to get types(for EAP): https://issues.redhat.com/rest/api/2/issue/createmeta?projectKeys=JBEAP
    protected Long issueType;
    protected String securityLevel;
    protected boolean securitySensitiveIssue;

    public Long getIssueType() {
        return issueType;
    }

    public JIRAIssueCreationDetails setIssueType(Long issueType) {
        this.issueType = issueType;
        return this;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public boolean isSecuritySensitiveIssue() {
        return securitySensitiveIssue;
    }

    public void setSecuritySensitiveIssue(boolean securitySensitiveIssue) {
        this.securitySensitiveIssue = securitySensitiveIssue;
    }
}
