package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: loaded from: classes10.dex */
public class SoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47893a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47893a = true;
    }

    public boolean getStatus() {
        return this.f47893a;
    }

    public void setSoundStatus(boolean z10) {
        this.f47893a = z10;
        if (z10) {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47893a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f47893a = true;
    }
}
