package com.KotHub.models

import java.util.*

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
                       val allowMergeCommit: Boolean?, val subscribersCount: Int?, val networkCount: Int?) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as KRepository

        if (id != other.id) return false
        if (owner != other.owner) return false
        if (name != other.name) return false
        if (fullName != other.fullName) return false
        if (description != other.description) return false
        if (private != other.private) return false
        if (fork != other.fork) return false
        if (url != other.url) return false
        if (htmlUrl != other.htmlUrl) return false
        if (archiveUrl != other.archiveUrl) return false
        if (assigneesUrl != other.assigneesUrl) return false
        if (blobsUrl != other.blobsUrl) return false
        if (branchesUrl != other.branchesUrl) return false
        if (cloneUrl != other.cloneUrl) return false
        if (collaboratorsUrl != other.collaboratorsUrl) return false
        if (commentsUrl != other.commentsUrl) return false
        if (commitsUrl != other.commitsUrl) return false
        if (compareUrl != other.compareUrl) return false
        if (contentsUrl != other.contentsUrl) return false
        if (contributorsUrl != other.contributorsUrl) return false
        if (deploymentsUrl != other.deploymentsUrl) return false
        if (downloadsUrl != other.downloadsUrl) return false
        if (eventsUrl != other.eventsUrl) return false
        if (forksUrl != other.forksUrl) return false
        if (gitCommitsUrl != other.gitCommitsUrl) return false
        if (gitRefsUrl != other.gitRefsUrl) return false
        if (gitTagsUrl != other.gitTagsUrl) return false
        if (gitUrl != other.gitUrl) return false
        if (hooksUrl != other.hooksUrl) return false
        if (issueCommentUrl != other.issueCommentUrl) return false
        if (issueEventsUrl != other.issueEventsUrl) return false
        if (issuesUrl != other.issuesUrl) return false
        if (keysUrl != other.keysUrl) return false
        if (labelsUrl != other.labelsUrl) return false
        if (mergesUrl != other.mergesUrl) return false
        if (milestonesUrl != other.milestonesUrl) return false
        if (mirrorUrl != other.mirrorUrl) return false
        if (notificationsUrl != other.notificationsUrl) return false
        if (pullsUrl != other.pullsUrl) return false
        if (releasesUrl != other.releasesUrl) return false
        if (sshUrl != other.sshUrl) return false
        if (stargazersUrl != other.stargazersUrl) return false
        if (subscribersUrl != other.subscribersUrl) return false
        if (subscriptionUrl != other.subscriptionUrl) return false
        if (svnUrl != other.svnUrl) return false
        if (tagsUrl != other.tagsUrl) return false
        if (teamsUrl != other.teamsUrl) return false
        if (treesUrl != other.treesUrl) return false
        if (homepage != other.homepage) return false
        if (language != other.language) return false
        if (forksCount != other.forksCount) return false
        if (stargazersCount != other.stargazersCount) return false
        if (watchersCount != other.watchersCount) return false
        if (size != other.size) return false
        if (defaultBranch != other.defaultBranch) return false
        if (openIssuesCount != other.openIssuesCount) return false
        if (!Arrays.equals(topics, other.topics)) return false
        if (hasIssues != other.hasIssues) return false
        if (hasWiki != other.hasWiki) return false
        if (hasPages != other.hasPages) return false
        if (hasDownloads != other.hasDownloads) return false
        if (archived != other.archived) return false
        if (pushedAt != other.pushedAt) return false
        if (createdAt != other.createdAt) return false
        if (updatedAt != other.updatedAt) return false
        if (!Arrays.equals(permissions, other.permissions)) return false
        if (allowRebaseMerge != other.allowRebaseMerge) return false
        if (allowSquashMerge != other.allowSquashMerge) return false
        if (allowMergeCommit != other.allowMergeCommit) return false
        if (subscribersCount != other.subscribersCount) return false
        if (networkCount != other.networkCount) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id ?: 0
        result = 31 * result + (owner?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (fullName?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (private?.hashCode() ?: 0)
        result = 31 * result + (fork?.hashCode() ?: 0)
        result = 31 * result + (url?.hashCode() ?: 0)
        result = 31 * result + (htmlUrl?.hashCode() ?: 0)
        result = 31 * result + (archiveUrl?.hashCode() ?: 0)
        result = 31 * result + (assigneesUrl?.hashCode() ?: 0)
        result = 31 * result + (blobsUrl?.hashCode() ?: 0)
        result = 31 * result + (branchesUrl?.hashCode() ?: 0)
        result = 31 * result + (cloneUrl?.hashCode() ?: 0)
        result = 31 * result + (collaboratorsUrl?.hashCode() ?: 0)
        result = 31 * result + (commentsUrl?.hashCode() ?: 0)
        result = 31 * result + (commitsUrl?.hashCode() ?: 0)
        result = 31 * result + (compareUrl?.hashCode() ?: 0)
        result = 31 * result + (contentsUrl?.hashCode() ?: 0)
        result = 31 * result + (contributorsUrl?.hashCode() ?: 0)
        result = 31 * result + (deploymentsUrl?.hashCode() ?: 0)
        result = 31 * result + (downloadsUrl?.hashCode() ?: 0)
        result = 31 * result + (eventsUrl?.hashCode() ?: 0)
        result = 31 * result + (forksUrl?.hashCode() ?: 0)
        result = 31 * result + (gitCommitsUrl?.hashCode() ?: 0)
        result = 31 * result + (gitRefsUrl?.hashCode() ?: 0)
        result = 31 * result + (gitTagsUrl?.hashCode() ?: 0)
        result = 31 * result + (gitUrl?.hashCode() ?: 0)
        result = 31 * result + (hooksUrl?.hashCode() ?: 0)
        result = 31 * result + (issueCommentUrl?.hashCode() ?: 0)
        result = 31 * result + (issueEventsUrl?.hashCode() ?: 0)
        result = 31 * result + (issuesUrl?.hashCode() ?: 0)
        result = 31 * result + (keysUrl?.hashCode() ?: 0)
        result = 31 * result + (labelsUrl?.hashCode() ?: 0)
        result = 31 * result + (mergesUrl?.hashCode() ?: 0)
        result = 31 * result + (milestonesUrl?.hashCode() ?: 0)
        result = 31 * result + (mirrorUrl?.hashCode() ?: 0)
        result = 31 * result + (notificationsUrl?.hashCode() ?: 0)
        result = 31 * result + (pullsUrl?.hashCode() ?: 0)
        result = 31 * result + (releasesUrl?.hashCode() ?: 0)
        result = 31 * result + (sshUrl?.hashCode() ?: 0)
        result = 31 * result + (stargazersUrl?.hashCode() ?: 0)
        result = 31 * result + (subscribersUrl?.hashCode() ?: 0)
        result = 31 * result + (subscriptionUrl?.hashCode() ?: 0)
        result = 31 * result + (svnUrl?.hashCode() ?: 0)
        result = 31 * result + (tagsUrl?.hashCode() ?: 0)
        result = 31 * result + (teamsUrl?.hashCode() ?: 0)
        result = 31 * result + (treesUrl?.hashCode() ?: 0)
        result = 31 * result + (homepage?.hashCode() ?: 0)
        result = 31 * result + (language?.hashCode() ?: 0)
        result = 31 * result + (forksCount ?: 0)
        result = 31 * result + (stargazersCount ?: 0)
        result = 31 * result + (watchersCount ?: 0)
        result = 31 * result + (size ?: 0)
        result = 31 * result + (defaultBranch?.hashCode() ?: 0)
        result = 31 * result + (openIssuesCount ?: 0)
        result = 31 * result + (topics?.let { Arrays.hashCode(it) } ?: 0)
        result = 31 * result + (hasIssues?.hashCode() ?: 0)
        result = 31 * result + (hasWiki?.hashCode() ?: 0)
        result = 31 * result + (hasPages?.hashCode() ?: 0)
        result = 31 * result + (hasDownloads?.hashCode() ?: 0)
        result = 31 * result + (archived?.hashCode() ?: 0)
        result = 31 * result + (pushedAt?.hashCode() ?: 0)
        result = 31 * result + (createdAt?.hashCode() ?: 0)
        result = 31 * result + (updatedAt?.hashCode() ?: 0)
        result = 31 * result + (permissions?.let { Arrays.hashCode(it) } ?: 0)
        result = 31 * result + (allowRebaseMerge?.hashCode() ?: 0)
        result = 31 * result + (allowSquashMerge?.hashCode() ?: 0)
        result = 31 * result + (allowMergeCommit?.hashCode() ?: 0)
        result = 31 * result + (subscribersCount ?: 0)
        result = 31 * result + (networkCount ?: 0)
        return result
    }
}