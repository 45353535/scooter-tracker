package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class x8 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f61041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f61042b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f61043c;

    public static class a extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f61045b;

        public a(Context context) {
            super(context);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            int size = View.MeasureSpec.getSize(i10);
            int size2 = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            if (size == 0) {
                size = this.f61044a;
            }
            if (size2 == 0) {
                size2 = this.f61045b;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        }
    }

    public static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ma f61046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FrameLayout f61047b;

        public b(FrameLayout frameLayout, ma maVar, FrameLayout frameLayout2) {
            super(frameLayout);
            this.f61046a = maVar;
            this.f61047b = frameLayout2;
        }
    }

    public interface c extends m8 {
        void a(int i10);
    }

    public x8(Context context) {
        this.f61041a = context;
    }

    public final /* synthetic */ void a(View view) {
        this.f61043c.a(view, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f61042b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == this.f61042b.size() - 1 ? 2 : 0;
    }

    public void a(List list) {
        this.f61042b.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(b bVar, int i10) {
        c cVar = this.f61043c;
        if (cVar != null) {
            cVar.a(i10);
        }
        d7 d7Var = i10 < this.f61042b.size() ? (d7) this.f61042b.get(i10) : null;
        ImageData imageDataS = d7Var != null ? d7Var.s() : null;
        if (imageDataS != null) {
            bVar.f61046a.setPlaceholderDimensions(imageDataS.getWidth(), imageDataS.getHeight());
            Bitmap bitmap = imageDataS.getBitmap();
            if (bitmap != null) {
                bVar.f61046a.setImageBitmap(bitmap);
            } else {
                a3.b(imageDataS, bVar.f61046a);
            }
        }
        bVar.f61046a.setContentDescription("card_" + i10);
        bVar.f61047b.setOnClickListener(new View.OnClickListener() { // from class: k5.x2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86160b.a(view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        a aVar = new a(this.f61041a);
        aVar.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        ma maVar = new ma(this.f61041a);
        kb.b(maVar, "card_media_view");
        aVar.addView(maVar, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(this.f61041a);
        if (viewGroup.isClickable()) {
            kb.a(frameLayout, 0, 1153821432);
        }
        aVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return new b(aVar, maVar, frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(b bVar) {
        int adapterPosition = bVar.getAdapterPosition();
        d7 d7Var = (adapterPosition <= 0 || adapterPosition >= this.f61042b.size()) ? null : (d7) this.f61042b.get(adapterPosition);
        bVar.f61046a.setImageData(null);
        ImageData imageDataS = d7Var != null ? d7Var.s() : null;
        if (imageDataS != null) {
            a3.a(imageDataS, bVar.f61046a);
        }
        bVar.f61047b.setOnClickListener(null);
    }

    public void a() {
        this.f61042b.clear();
        notifyDataSetChanged();
        this.f61043c = null;
    }

    public void a(c cVar) {
        this.f61043c = cVar;
    }
}
