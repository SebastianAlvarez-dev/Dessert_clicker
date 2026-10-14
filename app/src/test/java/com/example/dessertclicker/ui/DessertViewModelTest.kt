package com.example.dessertclicker.ui

import com.example.dessertclicker.R
import org.junit.Assert.assertEquals
import org.junit.Test

class DessertViewModelTest {
    @Test
    fun fiveDessertsSold_switchesToDonut() {
        val viewModel = DessertViewModel()

        repeat(5) { viewModel.onDessertClicked() }

        val uiState = viewModel.dessertUiState.value
        assertEquals(5, uiState.dessertsSold)
        assertEquals(25, uiState.revenue)
        assertEquals(R.drawable.donut, uiState.currentDessertImageId)
        assertEquals(10, uiState.currentDessertPrice)
    }
}
