package com.example.words

import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.navigation.Navigation
import androidx.navigation.testing.TestNavHostController
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ApplicationProvider
import org.junit.runner.RunWith
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import junit.framework.Assert.assertEquals

@RunWith(AndroidJUnit4::class)
class NavigationTests {
    @Test
    fun navigate_to_words_nav_component() {
        // navigation controller test instance
        val navController = TestNavHostController(
            ApplicationProvider.getApplicationContext()
        )

        // isolate the fragment LetterListFragment
        val letterListScenario =
            launchFragmentInContainer<LetterListFragment>(themeResId = R.style.Theme_Words)

        // explicitly declare the navigation graph that we want the
        // navigation controller to use for the launched fragment
        letterListScenario.onFragment { fragment ->
            navController.setGraph(R.navigation.nav_graph)
            Navigation.setViewNavController(fragment.requireView(), navController)
        }

        // activate the element that requests navigation
        onView(withText(R.id.recycler_view))
            .perform(
                RecyclerViewActions
                    .actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click())
            )

        assertEquals(navController.currentDestination?.id, R.id.wordListFragment)
    }

}