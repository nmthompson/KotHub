package com.KotHub.models

data class KRepository(val id: Int?, val owner: KUser?, val name: String?, val fullName: String?, val description: String?,
                       val private: Boolean?, val fork: Boolean?, val url: String?, val htmlUrl: String?, val archiveUrl: String?,
                       val assigneesUrl: String?, val blobsUrl: String?, val branchesUrl: String?, val cloneUrl: String?,
                       val collaboratorsUrl: String?, val commentsUrl: String?, val commitsUrl: String?, val compareUrl: String?,
                       val contentsUrl: String?, val contributorsUrl: String?, val deploymentsUrl: String?, val downloadsUrl: String?,
                       val eventsUrl: String?, val forksUrl: String?, val gitCommitsUrl: String?, val gitRefsUrl: String?,
                       val gitTagsUrl: String?, val gitUrl: String?, val hooksUrl: String?, val issueCommentUrl: String?,
                       val issueEventsUrl: String?, val issuesUrl: String?, val keysUrl: String?, val labelsUrl: String?, val mergesUrl: String?,
                       val milestonesUrl: String?, val mirrorUrl: String?, val notificationsUrl: String?, val pullsUrl: String?,
                       val releasesUrl: String?, val sshUrl: String?, val stargazersUrl: String?, val subscribersUrl: String?,
                       val subscriptionUrl: String?, val svnUrl: String?, val tagsUrl: String?, val teamsUrl: String?, val treesUrl: String?,
                       val homepage: String?, val language: String?, val forksCount: Int?, val stargazersCount: Int?,
                       val watchersCount: Int?, val size: Int?, val defaultBranch: String?, val openIssuesCount: Int?, val topics: Array<String>?,
                       val hasIssues: Boolean?, val hasWiki: Boolean?, val hasPages: Boolean?, val hasDownloads: Boolean?,
                       val archived: Boolean?, val pushedAt: String?, val createdAt: String?, val updatedAt: String?,
                       val permissions: Array<KPermissions>?, val allowRebaseMerge: Boolean?, val allowSquashMerge: Boolean?,
                       val allowMergeCommit: Boolean?, val subscribersCount: Int?, val networkCount: Int?)