package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes4.dex */
public class HeightScrollView extends ScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f102870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f102871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f102872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102873d;

    public interface a {
        void a(int i10);
    }

    public HeightScrollView(Context context) {
        super(context);
        this.f102871b = true;
        this.f102873d = 0;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        View view = this.f102872c;
        if (view != null) {
            this.f102873d = view.getHeight() - i11;
        }
        a aVar = this.f102870a;
        if (aVar != null) {
            aVar.a(i11);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f102871b) {
            return false;
        }
        if (this.f102872c == null || y10 >= this.f102873d) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBlankView(View view) {
        this.f102872c = view;
    }

    public void setOnScrollListener(a aVar) {
        this.f102870a = aVar;
    }

    public void setScrollEnable(boolean z10) {
        this.f102871b = z10;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102871b = true;
        this.f102873d = 0;
    }

    public HeightScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f102871b = true;
        this.f102873d = 0;
    }
}
