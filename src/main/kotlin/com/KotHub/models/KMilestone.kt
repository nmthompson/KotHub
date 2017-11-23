package com.KotHub.models

data class KMilestone(val url: String, val htmlUrl: String, val labelsUrl: String, val id: Int, val number: Int,
                      val state: String, val title: String, val description: String, val creator: KUser, val openIssues: Int,
                      val closedIssues: Int, val createdAt: String, val updatedAt: String, val closedAt: String, val dueOn: String)