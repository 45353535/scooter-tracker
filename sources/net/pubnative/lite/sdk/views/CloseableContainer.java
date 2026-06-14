package net.pubnative.lite.sdk.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.R;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.vpaid.helpers.BitmapHelper;

/* JADX INFO: loaded from: classes3.dex */
public class CloseableContainer extends FrameLayout {
    static final float CLOSE_BUTTON_PADDING_BORDER_DP = 0.0f;
    static final float CLOSE_BUTTON_PADDING_DP = 0.0f;
    private static final float CLOSE_REGION_SIZE_DP = 30.0f;
    private final ImageButton mCloseButton;
    private ClosePosition mClosePosition;
    private Integer mCustomCloseSize;
    private Integer mCustomSkipSize;
    private OnCloseListener mOnCloseListener;
    private OnSkipListener mOnSkipListener;
    private final ImageButton mSkipButton;

    public enum ClosePosition {
        TOP_LEFT(8388659),
        TOP_CENTER(49),
        TOP_RIGHT(8388661),
        CENTER(17),
        BOTTOM_LEFT(8388691),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(8388693),
        RANDOM(0);

        private final int mGravity;

        ClosePosition(int i10) {
            this.mGravity = i10;
        }

        public static ClosePosition getRandomPosition() {
            return values()[new Random().nextInt(values().length)];
        }

        int getGravity() {
            return this.mGravity;
        }
    }

    public interface OnCloseListener {
        void onClose();
    }

    public interface OnSkipListener {
        void onSkip();
    }

    public CloseableContainer(Context context) {
        this(context, null, 0);
    }

    public static /* synthetic */ void a(CloseableContainer closeableContainer, View view) {
        closeableContainer.playSoundEffect(0);
        OnSkipListener onSkipListener = closeableContainer.mOnSkipListener;
        if (onSkipListener != null) {
            onSkipListener.onSkip();
        }
    }

    public static /* synthetic */ void b(CloseableContainer closeableContainer, View view) {
        closeableContainer.playSoundEffect(0);
        OnCloseListener onCloseListener = closeableContainer.mOnCloseListener;
        if (onCloseListener != null) {
            onCloseListener.onClose();
        }
    }

    private void positionCloseButton() {
        FrameLayout.LayoutParams layoutParams;
        if (this.mCustomCloseSize != null) {
            layoutParams = new FrameLayout.LayoutParams(this.mCustomCloseSize.intValue(), this.mCustomCloseSize.intValue());
            this.mCloseButton.setId(R.id.button_fullscreen_close_small);
            int iConvertDpToPixel = (int) ViewUtils.convertDpToPixel(8.0f, getContext());
            layoutParams.setMargins(iConvertDpToPixel, iConvertDpToPixel, iConvertDpToPixel, iConvertDpToPixel);
        } else {
            int iConvertDpToPixel2 = (int) ViewUtils.convertDpToPixel(30.0f, getContext());
            layoutParams = new FrameLayout.LayoutParams(iConvertDpToPixel2, iConvertDpToPixel2);
        }
        layoutParams.gravity = this.mClosePosition.getGravity();
        View view = this.mSkipButton;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.mCloseButton;
        if (view2 != null) {
            removeView(view2);
            addView(this.mCloseButton, layoutParams);
        }
    }

    private void positionSkipButton() {
        FrameLayout.LayoutParams layoutParams;
        if (this.mCustomSkipSize != null) {
            layoutParams = new FrameLayout.LayoutParams(this.mCustomSkipSize.intValue(), this.mCustomSkipSize.intValue());
            this.mSkipButton.setId(R.id.button_fullscreen_skip_small);
            int iConvertDpToPixel = (int) ViewUtils.convertDpToPixel(8.0f, getContext());
            layoutParams.setMargins(iConvertDpToPixel, iConvertDpToPixel, iConvertDpToPixel, iConvertDpToPixel);
        } else {
            int iConvertDpToPixel2 = (int) ViewUtils.convertDpToPixel(30.0f, getContext());
            layoutParams = new FrameLayout.LayoutParams(iConvertDpToPixel2, iConvertDpToPixel2);
        }
        layoutParams.gravity = 8388659;
        View view = this.mCloseButton;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.mSkipButton;
        if (view2 != null) {
            removeView(view2);
            addView(this.mSkipButton, layoutParams);
        }
    }

    public void setClosePosition(ClosePosition closePosition) {
        if (closePosition != null) {
            if (closePosition == ClosePosition.RANDOM) {
                this.mClosePosition = ClosePosition.getRandomPosition();
                return;
            }
            if (closePosition != ClosePosition.TOP_LEFT) {
                this.mClosePosition = closePosition;
                return;
            }
            int iConvertDpToPixel = (int) ViewUtils.convertDpToPixel(0.0f, getContext());
            int iConvertDpToPixel2 = (int) ViewUtils.convertDpToPixel(0.0f, getContext());
            this.mClosePosition = closePosition;
            this.mCloseButton.setPadding(iConvertDpToPixel2, iConvertDpToPixel2, iConvertDpToPixel, iConvertDpToPixel);
        }
    }

    public void setCloseSize(Integer num) {
        this.mCustomCloseSize = Integer.valueOf((int) ViewUtils.convertDpToPixel(num.floatValue(), getContext()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.mCustomCloseSize.intValue(), this.mCustomCloseSize.intValue());
        layoutParams.gravity = this.mClosePosition.getGravity();
        removeView(this.mCloseButton);
        addView(this.mCloseButton, layoutParams);
    }

    public void setCloseVisible(boolean z10) {
        ImageButton imageButton = this.mSkipButton;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        ImageButton imageButton2 = this.mCloseButton;
        if (imageButton2 != null) {
            imageButton2.setVisibility(z10 ? 0 : 8);
            if (z10) {
                positionCloseButton();
            }
        }
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.mOnCloseListener = onCloseListener;
    }

    public void setOnSkipListener(OnSkipListener onSkipListener) {
        this.mOnSkipListener = onSkipListener;
    }

    public void setSkipSize(Integer num) {
        this.mCustomSkipSize = Integer.valueOf((int) ViewUtils.convertDpToPixel(num.floatValue(), getContext()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.mCustomSkipSize.intValue(), this.mCustomSkipSize.intValue());
        layoutParams.gravity = 8388659;
        removeView(this.mSkipButton);
        addView(this.mSkipButton, layoutParams);
    }

    public void setSkipVisible(boolean z10) {
        ImageButton imageButton = this.mCloseButton;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        ImageButton imageButton2 = this.mSkipButton;
        if (imageButton2 != null) {
            imageButton2.setVisibility(z10 ? 0 : 8);
            if (z10) {
                positionSkipButton();
            }
        }
    }

    public CloseableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseableContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mCustomCloseSize = null;
        this.mCustomSkipSize = null;
        this.mClosePosition = ClosePosition.TOP_LEFT;
        int iConvertDpToPixel = (int) ViewUtils.convertDpToPixel(0.0f, context);
        int iConvertDpToPixel2 = (int) ViewUtils.convertDpToPixel(0.0f, context);
        ImageButton imageButton = new ImageButton(context);
        this.mCloseButton = imageButton;
        ImageButton imageButton2 = new ImageButton(context);
        this.mSkipButton = imageButton2;
        Integer normalCloseXmlResource = HyBid.getNormalCloseXmlResource();
        int i11 = R.mipmap.close;
        Bitmap bitmap = BitmapHelper.toBitmap(context, normalCloseXmlResource, Integer.valueOf(i11));
        Integer normalCloseXmlResource2 = HyBid.getNormalCloseXmlResource();
        int i12 = R.mipmap.skip;
        Bitmap bitmap2 = BitmapHelper.toBitmap(context, normalCloseXmlResource2, Integer.valueOf(i12));
        if (bitmap != null) {
            imageButton.setImageBitmap(bitmap);
        } else {
            imageButton.setImageBitmap(BitmapHelper.decodeResource(imageButton.getContext(), Integer.valueOf(i11)));
        }
        if (bitmap2 != null) {
            imageButton2.setImageBitmap(bitmap2);
        } else {
            imageButton2.setImageBitmap(BitmapHelper.decodeResource(imageButton2.getContext(), Integer.valueOf(i12)));
        }
        imageButton.setId(R.id.button_fullscreen_close);
        imageButton.setBackgroundColor(0);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageButton.setScaleType(scaleType);
        imageButton.setPadding(iConvertDpToPixel, iConvertDpToPixel2, iConvertDpToPixel2, iConvertDpToPixel);
        imageButton2.setId(R.id.button_fullscreen_skip);
        imageButton2.setBackgroundColor(0);
        imageButton2.setScaleType(scaleType);
        imageButton2.setPadding(iConvertDpToPixel, iConvertDpToPixel2, iConvertDpToPixel2, iConvertDpToPixel);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloseableContainer.b(this.f96031b, view);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloseableContainer.a(this.f96032b, view);
            }
        });
    }
}
