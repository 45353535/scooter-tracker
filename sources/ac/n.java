package ac;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dc.r;
import dc.s;
import io.bidmachine.ImageData;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public abstract class n implements i {

    @Nullable
    private LabelData adLabelData;
    private String callToAction;
    private String clickUrl;
    private String description;
    private boolean hasVideo;
    private ImageData iconImageData;
    private ImageData mainImageData;

    @Nullable
    private PrivacySheetData privacySheetData;
    private String title;
    private String videoAdm;
    private String videoUrl;
    private float rating = -1.0f;
    private boolean isNetworkControlLoadingAssets = true;

    @Nullable
    public ViewGroup configureContainer(@NonNull Context context) {
        return null;
    }

    @Nullable
    public View createCustomMediaView(@NonNull Context context) {
        return null;
    }

    @Nullable
    public View createProviderView(@NonNull Context context) {
        if (this.adLabelData == null && this.privacySheetData == null) {
            return null;
        }
        r rVar = new r(context);
        rVar.b(this);
        rVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return rVar;
    }

    @Override // ac.i
    @Nullable
    public LabelData getAdLabelData() {
        return this.adLabelData;
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    @Nullable
    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getDescription() {
        return this.description;
    }

    @Override // ac.o
    @Nullable
    public ImageData getIcon() {
        return this.iconImageData;
    }

    @Override // ac.o
    @Nullable
    public ImageData getMainImage() {
        return this.mainImageData;
    }

    @Override // ac.i
    @Nullable
    public PrivacySheetData getPrivacySheetData() {
        return this.privacySheetData;
    }

    public float getRating() {
        return this.rating;
    }

    public String getTitle() {
        return this.title;
    }

    @Override // ac.i
    @Nullable
    public String getVideoAdm() {
        return this.videoAdm;
    }

    @Override // ac.i
    @Nullable
    public String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // ac.o
    public boolean hasVideo() {
        return this.hasVideo;
    }

    public boolean isNetworkControlLoadingAssets() {
        return this.isNetworkControlLoadingAssets;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(getTitle()) || TextUtils.isEmpty(getDescription()) || TextUtils.isEmpty(getCallToAction())) ? false : true;
    }

    @NonNull
    public n setAdLabelData(@Nullable LabelData labelData) {
        this.adLabelData = labelData;
        return this;
    }

    public n setCallToAction(String str) {
        this.callToAction = str;
        return this;
    }

    public n setClickUrl(String str) {
        this.clickUrl = str;
        return this;
    }

    public n setDescription(String str) {
        this.description = str;
        return this;
    }

    public n setHasVideo(boolean z10) {
        this.hasVideo = z10;
        return this;
    }

    public n setIcon(ImageData imageData) {
        this.iconImageData = imageData;
        return this;
    }

    public n setMainImage(ImageData imageData) {
        this.mainImageData = imageData;
        return this;
    }

    public n setNetworkControlLoadingAssets(boolean z10) {
        this.isNetworkControlLoadingAssets = z10;
        return this;
    }

    @NonNull
    public n setPrivacySheetData(@Nullable PrivacySheetData privacySheetData) {
        this.privacySheetData = privacySheetData;
        return this;
    }

    public n setRating(float f10) {
        this.rating = f10;
        return this;
    }

    public n setTitle(String str) {
        this.title = str;
        return this;
    }

    public n setVideoAdm(String str) {
        this.videoAdm = str;
        return this;
    }

    public n setVideoUrl(String str) {
        this.videoUrl = str;
        return this;
    }

    public void destroy() {
    }

    public void unregisterNative() {
    }

    public void registerNative(@NonNull ViewGroup viewGroup, @Nullable ImageView imageView, @Nullable s sVar, @Nullable Set<View> set) {
    }
}
