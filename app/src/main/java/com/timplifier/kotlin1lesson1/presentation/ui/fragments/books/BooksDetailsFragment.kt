package com.timplifier.kotlin1lesson1.presentation.ui.fragments.books

import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kotlin1lesson1.R
import com.timplifier.kotlin1lesson1.databinding.FragmentBooksDetailsBinding
import com.timplifier.kotlin1lesson1.presentation.base.BaseFragment

class BooksDetailsFragment : BaseFragment<FragmentBooksDetailsBinding>(
    R.layout.fragment_books_details
) {
    override val binding: FragmentBooksDetailsBinding by viewBinding(FragmentBooksDetailsBinding::bind)
    private val args: BooksDetailsFragmentArgs by navArgs()

    override fun setupViews() {
        binding.tvDescription.text =
            args.booksDescription
    }


}