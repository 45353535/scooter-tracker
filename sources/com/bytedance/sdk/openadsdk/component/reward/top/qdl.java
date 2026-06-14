package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes6.dex */
public interface qdl<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i10);

    void setListener(ud udVar);

    void setShowDislike(boolean z10);

    void setShowEndCardNextAd(boolean z10, ljh ljhVar);

    void setShowPlayableNextAd(boolean z10, ljh ljhVar);

    void setShowSkip(boolean z10);

    void setShowSound(boolean z10);

    void setSkipEnable(boolean z10);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z10);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
