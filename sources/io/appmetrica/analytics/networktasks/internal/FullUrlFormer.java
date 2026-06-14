package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class FullUrlFormer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f78859a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f78860b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f78861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IParamsAppender f78862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConfigProvider f78863e;

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.f78862d = iParamsAppender;
        this.f78863e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f78859a.get(this.f78860b)).buildUpon();
        this.f78862d.appendParams(builderBuildUpon, this.f78863e.getConfig());
        this.f78861c = builderBuildUpon.build().toString();
    }

    @Nullable
    public List<String> getAllHosts() {
        return this.f78859a;
    }

    @Nullable
    public String getUrl() {
        return new c(this.f78861c).f78834a;
    }

    public boolean hasMoreHosts() {
        return this.f78860b + 1 < this.f78859a.size();
    }

    public void incrementAttemptNumber() {
        this.f78860b++;
    }

    public void setHosts(@Nullable List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f78859a = list;
    }
}
