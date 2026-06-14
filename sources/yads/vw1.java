package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class vw1 implements uw1 {
    @Override // yads.uw1
    public final View a(View view, String str) {
        return null;
    }

    @Override // yads.uw1
    public final CheckBox b(View view) {
        return null;
    }

    @Override // yads.uw1
    public final CustomizableMediaView c(View view) {
        return (CustomizableMediaView) view.findViewById(R$id.media);
    }

    @Override // yads.uw1
    public final TextView d(View view) {
        return (TextView) view.findViewById(R$id.price);
    }

    @Override // yads.uw1
    public final TextView e(View view) {
        return (TextView) view.findViewById(R$id.call_to_action);
    }

    @Override // yads.uw1
    public final TextView f(View view) {
        return (TextView) view.findViewById(R$id.warning);
    }

    @Override // yads.uw1
    public final ImageView g(View view) {
        return (ImageView) view.findViewById(R$id.favicon);
    }

    @Override // yads.uw1
    public final TextView h(View view) {
        return (TextView) view.findViewById(R$id.age);
    }

    @Override // yads.uw1
    public final View i(View view) {
        return view.findViewById(R$id.rating);
    }

    @Override // yads.uw1
    public final TextView j(View view) {
        return (TextView) view.findViewById(R$id.title);
    }

    @Override // yads.uw1
    public final ProgressBar k(View view) {
        return null;
    }

    @Override // yads.uw1
    public final ImageView l(View view) {
        return (ImageView) view.findViewById(R$id.feedback);
    }

    @Override // yads.uw1
    public final TextView m(View view) {
        return (TextView) view.findViewById(R$id.sponsored);
    }

    @Override // yads.uw1
    public final TextView n(View view) {
        return (TextView) view.findViewById(R$id.domain);
    }

    @Override // yads.uw1
    public final ImageView o(View view) {
        return (ImageView) view.findViewById(R$id.icon);
    }

    @Override // yads.uw1
    public final TextView p(View view) {
        return (TextView) view.findViewById(R$id.review_count);
    }

    @Override // yads.uw1
    public final TextView a(View view) {
        return (TextView) view.findViewById(R$id.body);
    }
}
