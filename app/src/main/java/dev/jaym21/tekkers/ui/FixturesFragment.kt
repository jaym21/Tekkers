package dev.jaym21.tekkers.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import dev.jaym21.tekkers.adapters.FixtureDatesRVAdapter
import dev.jaym21.tekkers.databinding.FragmentFixturesBinding
import dev.jaym21.tekkers.utils.DateUtils

class FixturesFragment : Fragment() {

    private var binding: FragmentFixturesBinding? = null
    private lateinit var fixtureDatesAdapter: FixtureDatesRVAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFixturesBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //getting fixture dates timestamp array
        val fixtureDates = DateUtils().getTimestampsOfDatesForFixtures()

        fixtureDatesAdapter = FixtureDatesRVAdapter(fixtureDates.toList())

        setUpFixtureDatesRV()

        binding?.rvDates?.layoutManager?.scrollToPosition(10)
    }

    private fun setUpFixtureDatesRV() {
        binding?.rvDates?.apply {
            adapter = fixtureDatesAdapter
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}