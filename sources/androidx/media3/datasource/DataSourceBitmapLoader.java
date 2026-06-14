package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final Supplier<ListeningExecutorService> DEFAULT_EXECUTOR_SERVICE = Suppliers.memoize(new Supplier() { // from class: androidx.media3.datasource.e
        @Override // com.google.common.base.Supplier
        public final Object get() {
            return MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        }
    });
    private final DataSource.Factory dataSourceFactory;
    private final ListeningExecutorService listeningExecutorService;

    @Nullable
    private final BitmapFactory.Options options;

    public DataSourceBitmapLoader(Context context) {
        this((ListeningExecutorService) Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get()), new DefaultDataSource.Factory(context));
    }

    public static /* synthetic */ Bitmap a(DataSourceBitmapLoader dataSourceBitmapLoader, byte[] bArr) {
        dataSourceBitmapLoader.getClass();
        return BitmapUtil.decode(bArr, bArr.length, dataSourceBitmapLoader.options);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap load(DataSource dataSource, Uri uri, @Nullable BitmapFactory.Options options) throws IOException {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] toEnd = DataSourceUtil.readToEnd(dataSource);
            return BitmapUtil.decode(toEnd, toEnd.length, options);
        } finally {
            dataSource.close();
        }
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public ListenableFuture<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DataSourceBitmapLoader.a(this.f4764b, bArr);
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public ListenableFuture<Bitmap> loadBitmap(final Uri uri) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                DataSourceBitmapLoader dataSourceBitmapLoader = this.f4766b;
                return DataSourceBitmapLoader.load(dataSourceBitmapLoader.dataSourceFactory.createDataSource(), uri, dataSourceBitmapLoader.options);
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public /* synthetic */ ListenableFuture loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        return androidx.media3.common.util.a.a(this, mediaMetadata);
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    public DataSourceBitmapLoader(ListeningExecutorService listeningExecutorService, DataSource.Factory factory) {
        this(listeningExecutorService, factory, null);
    }

    public DataSourceBitmapLoader(ListeningExecutorService listeningExecutorService, DataSource.Factory factory, @Nullable BitmapFactory.Options options) {
        this.listeningExecutorService = listeningExecutorService;
        this.dataSourceFactory = factory;
        this.options = options;
    }
}
