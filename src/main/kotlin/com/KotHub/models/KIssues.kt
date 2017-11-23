package com.KotHub.models

data class KIssues(val id: Int?, val url: String?, val reporsitoryUrl: String?, val labelsUrl: String?, val commentsUrl: String?,
                     val eventsUrl: String?, val htmlUrl: String?, val number: Int?, val state: String?, val title: String?, val user: KUser?,
                     val labels: KLabels?, val assignee: KUser?, val assignees: Array<KUser>?, val milestone: KMilestone?,
                     val locked: Boolean?, val comments: Int?, val pullRequests: KPullRequests?, val closedAt: String?,
                     val createdAt: String?, val updatedAt: String?, val repository: KRepository?)