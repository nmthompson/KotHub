package com.KotHub.models

data class KHMilestone(val url: String?,
                       val htmlUrl: String?,
                       val labelsUrl: String?,
                       val id: Int?,
                       val number: Int?,
                       val state: String?,
                       val title: String?,
                       val description: String?,
                       val creator: KHUser?,
                       val openIssues: Int?,
                       val closedIssues: Int?,
                       val createdAt: String?,
                       val updatedAt: String?,
                       val closedAt: String?,
                       val dueOn: String?)
