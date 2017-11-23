package com.KotHub.models

import java.util.*

data class KIssues(val id: Int?, val url: String?, val reporsitoryUrl: String?, val labelsUrl: String?, val commentsUrl: String?,
                     val eventsUrl: String?, val htmlUrl: String?, val number: Int?, val state: String?, val title: String?, val user: KUser?,
                     val labels: KLabels?, val assignee: KUser?, val assignees: Array<KUser>?, val milestone: KMilestone?,
                     val locked: Boolean?, val comments: Int?, val pullRequests: KPullRequests?, val closedAt: String?,
                     val createdAt: String?, val updatedAt: String?, val repository: KRepository?) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as KIssues

        if (id != other.id) return false
        if (url != other.url) return false
        if (reporsitoryUrl != other.reporsitoryUrl) return false
        if (labelsUrl != other.labelsUrl) return false
        if (commentsUrl != other.commentsUrl) return false
        if (eventsUrl != other.eventsUrl) return false
        if (htmlUrl != other.htmlUrl) return false
        if (number != other.number) return false
        if (state != other.state) return false
        if (title != other.title) return false
        if (user != other.user) return false
        if (labels != other.labels) return false
        if (assignee != other.assignee) return false
        if (!Arrays.equals(assignees, other.assignees)) return false
        if (milestone != other.milestone) return false
        if (locked != other.locked) return false
        if (comments != other.comments) return false
        if (pullRequests != other.pullRequests) return false
        if (closedAt != other.closedAt) return false
        if (createdAt != other.createdAt) return false
        if (updatedAt != other.updatedAt) return false
        if (repository != other.repository) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + (url?.hashCode() ?: 0)
        result = 31 * result + (reporsitoryUrl?.hashCode() ?: 0)
        result = 31 * result + (labelsUrl?.hashCode() ?: 0)
        result = 31 * result + (commentsUrl?.hashCode() ?: 0)
        result = 31 * result + (eventsUrl?.hashCode() ?: 0)
        result = 31 * result + (htmlUrl?.hashCode() ?: 0)
        result = 31 * result + (number ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (title?.hashCode() ?: 0)
        result = 31 * result + (user?.hashCode() ?: 0)
        result = 31 * result + (labels?.hashCode() ?: 0)
        result = 31 * result + (assignee?.hashCode() ?: 0)
        result = 31 * result + (assignees?.let { Arrays.hashCode(it) } ?: 0)
        result = 31 * result + (milestone?.hashCode() ?: 0)
        result = 31 * result + (locked?.hashCode() ?: 0)
        result = 31 * result + (comments ?: 0)
        result = 31 * result + (pullRequests?.hashCode() ?: 0)
        result = 31 * result + (closedAt?.hashCode() ?: 0)
        result = 31 * result + (createdAt?.hashCode() ?: 0)
        result = 31 * result + (updatedAt?.hashCode() ?: 0)
        result = 31 * result + (repository?.hashCode() ?: 0)
        return result
    }
}