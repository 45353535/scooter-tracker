package com.mobilefuse.sdk.storyboard;

import android.view.View;
import com.mobilefuse.sdk.omid.OmidBridge;
import com.mobilefuse.sdk.omid.OmidFriendlyObstructionPurpose;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardOmidBridge;", "Lcom/mobilefuse/sdk/omid/OmidBridge;", "()V", "addFriendlyObstruction", "", "friendlyObstruction", "Landroid/view/View;", "purpose", "Lcom/mobilefuse/sdk/omid/OmidFriendlyObstructionPurpose;", "detailedReason", "", "finishAdSession", "getPartnerName", "getPartnerVersion", "removeAllFriendlyObstructions", "removeFriendlyObstruction", "signalAdImpressionEvent", "startAdSession", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class StoryboardOmidBridge implements OmidBridge {
    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void addFriendlyObstruction(@Nullable View friendlyObstruction, @Nullable OmidFriendlyObstructionPurpose purpose, @Nullable String detailedReason) {
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void finishAdSession() {
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    @NotNull
    public String getPartnerName() {
        return "";
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    @NotNull
    public String getPartnerVersion() {
        return "";
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void removeAllFriendlyObstructions() {
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void removeFriendlyObstruction(@Nullable View friendlyObstruction) {
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void signalAdImpressionEvent() {
    }

    @Override // com.mobilefuse.sdk.omid.OmidBridge
    public void startAdSession() {
    }
}
