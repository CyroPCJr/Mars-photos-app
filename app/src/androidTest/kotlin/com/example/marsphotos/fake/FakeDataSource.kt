package com.example.marsphotos.fake

import com.example.marsphotos.network.MarsPhoto

object FakeDataSource {

    private const val ID_ONE = "img1"
    private const val ID_TWO = "img2"
    private const val IMG_ONE = "url.1"
    private const val IMG_TWO = "url.2"
    val photosList = listOf(
        MarsPhoto(
            id = ID_ONE,
            imgSrc = IMG_ONE
        ),
        MarsPhoto(
            id = ID_TWO,
            imgSrc = IMG_TWO
        )
    )
}