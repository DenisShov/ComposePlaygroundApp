package com.dshovhenia.compose.playgroundapp.data.model.user

import android.os.Parcelable
import com.dshovhenia.compose.playgroundapp.data.model.Connection
import kotlinx.parcelize.Parcelize

@Parcelize
class UserMetadata(
  var followersConnection: Connection? = null, var videosConnection: Connection? = null
) : Parcelable
