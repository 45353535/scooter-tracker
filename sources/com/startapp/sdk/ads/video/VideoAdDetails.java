package com.startapp.sdk.ads.video;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.ads.video.tracking.VideoTrackingDetails;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.internal.ej;
import com.startapp.sdk.internal.wi;
import com.startapp.sdk.internal.xi;
import com.startapp.sdk.omsdk.VerificationDetails;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class VideoAdDetails implements Serializable {
    private static final long serialVersionUID = 4938639129535870268L;

    @Nullable
    @TypeInfo(type = ArrayList.class, value = VerificationDetails.class)
    private List<VerificationDetails> adVerifications;
    private String clickUrl;
    private boolean clickable;
    private boolean closeable;
    private boolean isVideoMuted;
    private String localVideoPath;

    @TypeInfo(type = PostRollType.class)
    private PostRollType postRoll;
    private String postRollClickThroughUrl;
    private String postRollHtml;
    private boolean skippable;
    private long skippableAfter;

    @Nullable
    private Long unskipLess;

    @TypeInfo(complex = true)
    private VideoTrackingDetails videoTrackingDetails;
    private String videoUrl;

    @Keep
    public enum PostRollType {
        IMAGE,
        LAST_FRAME,
        NONE
    }

    @Keep
    public VideoAdDetails() {
    }

    @Nullable
    public List<VerificationDetails> getAdVerifications() {
        return this.adVerifications;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getLocalVideoPath() {
        return this.localVideoPath;
    }

    public String getPostRollClickThroughUrl() {
        return this.postRollHtml != null ? this.postRollClickThroughUrl : this.clickUrl;
    }

    @Nullable
    public String getPostRollHtml() {
        return this.postRollHtml;
    }

    public PostRollType getPostRollType() {
        return this.postRoll;
    }

    public long getSkippableAfter() {
        return this.skippableAfter;
    }

    @Nullable
    public Long getUnskipLess() {
        return this.unskipLess;
    }

    public VideoTrackingDetails getVideoTrackingDetails() {
        return this.videoTrackingDetails;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public boolean hasPostRoll() {
        return (this.postRoll == PostRollType.NONE && this.postRollHtml == null) ? false : true;
    }

    public boolean isClickable() {
        return this.clickable;
    }

    public boolean isCloseable() {
        return this.closeable;
    }

    public boolean isSkippable() {
        return this.skippable;
    }

    public boolean isVideoMuted() {
        return this.isVideoMuted;
    }

    public void setAdVerifications(@Nullable List<VerificationDetails> list) {
        this.adVerifications = list;
    }

    public void setLocalVideoPath(String str) {
        this.localVideoPath = str;
    }

    public void setVideoMuted(boolean z10) {
        this.isVideoMuted = z10;
    }

    public void setup() {
        this.skippableAfter = TimeUnit.SECONDS.toMillis(this.skippableAfter);
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    public VideoAdDetails(@NonNull xi xiVar, @NonNull VideoConfig videoConfig, @Nullable ej ejVar) {
        this.videoTrackingDetails = new VideoTrackingDetails(xiVar);
        this.videoUrl = xiVar.f65572p;
        if (ejVar != null) {
            Long l10 = ejVar.f64465a;
            this.skippableAfter = l10 != null ? l10.longValue() : xiVar.f65569m != null ? r3.intValue() : videoConfig.n();
            this.skippable = true;
            this.unskipLess = ejVar.f64466b;
        } else {
            this.skippable = false;
        }
        String str = xiVar.f65575s;
        this.clickUrl = str;
        this.clickable = str != null;
        this.postRoll = PostRollType.NONE;
        wi wiVar = xiVar.f65571o;
        if (wiVar != null) {
            this.postRollHtml = wiVar.f65482c.a();
            this.postRollClickThroughUrl = wiVar.f65483d;
        }
        setAdVerifications(DesugarCollections.unmodifiableList(xiVar.f65576t));
    }
}
