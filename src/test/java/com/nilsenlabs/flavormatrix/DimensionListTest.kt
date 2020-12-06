package com.nilsenlabs.flavormatrix

import com.nilsenlabs.flavormatrix.actions.DimensionList
import org.junit.Test
import kotlin.test.assertEquals

class DimensionListTest {
    @Test
    fun flavorsFromVariant_splitsCorrectly() {
        val res = DimensionList.flavorsFromVariant("alphaBravoCharlie")
        assertEquals(listOf("alpha", "bravo", "charlie"), res)
    }

    @Test
    fun flavorsFromVariant_singleItem() {
        val res = DimensionList.flavorsFromVariant("alpha")
        assertEquals(listOf("alpha"), res)
    }
}