package com.demo.imagesearch.room.imagedetails;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Flowable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ImageDetailsDao_Impl implements ImageDetailsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ImageDetails> __insertionAdapterOfImageDetails;

  private final SharedSQLiteStatement __preparedStmtOfUpdateComment;

  public ImageDetailsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfImageDetails = new EntityInsertionAdapter<ImageDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ImageDetails` (`id`,`comment`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ImageDetails value) {
        stmt.bindLong(1, value.getId());
        if (value.getComment() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getComment());
        }
      }
    };
    this.__preparedStmtOfUpdateComment = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ImageDetails SET comment = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final ImageDetails topics) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfImageDetails.insert(topics);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateComment(final int imageID, final String comment) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateComment.acquire();
    int _argIndex = 1;
    if (comment == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, comment);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, imageID);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateComment.release(_stmt);
    }
  }

  @Override
  public Flowable<String> getComment(final int imageID) {
    final String _sql = "SELECT comment FROM ImageDetails WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, imageID);
    return RxRoom.createFlowable(__db, false, new String[]{"ImageDetails"}, new Callable<String>() {
      @Override
      public String call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final String _result;
          if(_cursor.moveToFirst()) {
            _result = _cursor.getString(0);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
