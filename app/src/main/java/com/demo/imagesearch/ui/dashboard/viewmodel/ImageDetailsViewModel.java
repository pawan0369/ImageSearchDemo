package com.demo.imagesearch.ui.dashboard.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.demo.imagesearch.room.imagedetails.ImageDetails;
import com.demo.imagesearch.room.imagedetails.ImageDetailsDao;
import com.demo.imagesearch.ui.dashboard.model.ImageResult;
import javax.inject.Inject;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import kotlin.Unit;

public class ImageDetailsViewModel extends ViewModel{

    private ImageDetailsDao detailsDao;
    private MutableLiveData<ImageResult> result = new MutableLiveData<>();
    public LiveData<ImageResult> finalResult = result;

    private MutableLiveData<String> comment = new MutableLiveData<>("");
    public LiveData<String> resultComment = comment;

    @Inject
    public ImageDetailsViewModel(ImageDetailsDao detailsDao){
        this.detailsDao = detailsDao;
    }

    public void setResult(ImageResult imageResult){
        result.setValue(imageResult);
    }

    public void insertImageDetails(ImageDetails details){
        detailsDao.insert(details);
    }

    public void getCommentAddedToImage(Integer id){
        detailsDao.getComment(id).onErrorReturnItem("")
                .subscribeOn(Schedulers.io())
                .subscribe(new DisposableSubscriber<String>() {
                    @Override
                    public void onNext(String details) {
                        comment.postValue(details);
                    }

                    @Override
                    public void onError(Throwable t) {
                        comment.postValue("");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    public void updateComment(Integer id, String comment){
        detailsDao.updateComment(id, comment);
    }

}
