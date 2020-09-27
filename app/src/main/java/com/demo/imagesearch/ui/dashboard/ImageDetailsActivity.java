package com.demo.imagesearch.ui.dashboard;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;

import com.demo.imagesearch.R;
import com.demo.imagesearch.databinding.ActivityImageDetailsBinding;
import com.demo.imagesearch.room.imagedetails.ImageDetails;
import com.demo.imagesearch.ui.base.DataBindingActivity;
import com.demo.imagesearch.ui.dashboard.model.ImageResult;
import com.demo.imagesearch.ui.dashboard.viewmodel.ImageDetailsViewModel;

public class ImageDetailsActivity extends DataBindingActivity<ActivityImageDetailsBinding> {

    private ImageDetailsViewModel viewModel;
    private ImageResult result;

    @Override
    public int getLayoutRes() {
        return R.layout.activity_image_details;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = getViewModel(ImageDetailsViewModel.class);
        binding.setVm(viewModel);

        if (getIntent() != null) {
            result = (ImageResult) getIntent().getSerializableExtra("result");
            if (result != null) {
                setTitle(result.getTitle());
                viewModel.setResult(result);
            }
        }

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        if (result != null) viewModel.getCommentAddedToImage(result.getId());
        listenObserver();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    private void listenObserver() {
        viewModel.resultComment.observe(this, observeComment);
        binding.etComment.addTextChangedListener(changeListener);
    }

    private Observer<String> observeComment = new Observer<String>() {
        @Override
        public void onChanged(String s) {
//            binding.etComment.setText(s);
            binding.btnSubmit.setOnClickListener(v -> {
                if (s.equals("")) {
                    viewModel.insertImageDetails(new ImageDetails(result.getId(), binding.etComment.getText().toString()));
                } else
                    viewModel.updateComment(result.getId(), binding.etComment.getText().toString());
            });
        }
    };

    private TextWatcher changeListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (s.length() > 0) {
                binding.btnSubmit.setEnabled(true);
            } else {
                binding.btnSubmit.setEnabled(false);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
