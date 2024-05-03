package com.example.eliasapp

import com.google.firebase.firestore.Exclude

data class patients(
    @Exclude var courseID: String? = "",
    var courseName: String? = "",
    var courseDuration: String? = "",
    var courseDescription: String? = ""
)
