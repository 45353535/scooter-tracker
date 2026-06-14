package sg.bigo.ads.common.form;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.api.a.f;
import sg.bigo.ads.common.form.render.a.d;
import sg.bigo.ads.common.form.render.b;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.PrivacyCheckBox;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.common.form.render.b f102355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f102356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ViewFlow f102357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Indicator f102358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f102359e;

    private c(@NonNull RelativeLayout relativeLayout, @NonNull sg.bigo.ads.common.form.render.b bVar) {
        this.f102356b = relativeLayout;
        this.f102355a = bVar;
        this.f102357c = (ViewFlow) relativeLayout.findViewById(R.id.inter_image_view_flow);
        this.f102358d = (Indicator) relativeLayout.findViewById(R.id.inter_image_indicator);
        this.f102359e = (LinearLayout) relativeLayout.findViewById(R.id.inter_form_content);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static c a(Context context, @NonNull e eVar, @Nullable Map<String, Object> map, boolean z10, int i10, int i11, b.a aVar) {
        ViewGroup.LayoutParams layoutParams;
        int iA;
        RelativeLayout relativeLayout;
        sg.bigo.ads.common.form.render.b bVar = new sg.bigo.ads.common.form.render.b(context, eVar, map, i10, i11, aVar);
        sg.bigo.ads.common.form.render.a.a bVar2 = null;
        View view = null;
        RelativeLayout relativeLayout2 = (RelativeLayout) sg.bigo.ads.common.utils.a.a(bVar.f102387a, sg.bigo.ads.common.form.render.a.a(3), null, false);
        bVar.f102391e = relativeLayout2;
        if (relativeLayout2 == null) {
            relativeLayout = null;
        } else {
            if (z10) {
                sg.bigo.ads.common.form.render.c.a(relativeLayout2, bVar.f102387a, bVar.f102388b, bVar, 5);
            } else {
                sg.bigo.ads.common.form.render.b.a((TextView) relativeLayout2.findViewById(R.id.inter_form_content_title), bVar.f102388b.a());
                sg.bigo.ads.common.form.render.b.a((TextView) bVar.f102391e.findViewById(R.id.inter_form_content_description), bVar.f102388b.b());
                RelativeLayout relativeLayout3 = bVar.f102391e;
                e eVar2 = bVar.f102388b;
                int i12 = 1;
                if (eVar2.k() == null || !q.b((CharSequence) eVar2.k().c())) {
                    ViewGroup viewGroup = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_icon_layout);
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) relativeLayout3.findViewById(R.id.inter_form_content_layout);
                    if (viewGroup2 != null) {
                        viewGroup2.setPadding(0, 0, 0, 0);
                    }
                } else {
                    ImageView imageView = (ImageView) relativeLayout3.findViewById(R.id.inter_form_content_icon);
                    if (imageView != null) {
                        new sg.bigo.ads.common.p.b(imageView, (byte) 0).a(null, eVar2.k().c(), true);
                    }
                }
                RelativeLayout relativeLayout4 = bVar.f102391e;
                Context context2 = bVar.f102387a;
                e eVar3 = bVar.f102388b;
                View viewFindViewById = relativeLayout4.findViewById(R.id.inter_blank_viewholder);
                if (viewFindViewById != null && eVar3.j() != null) {
                    int iA2 = sg.bigo.ads.common.form.render.c.a(context2, eVar3);
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                    layoutParams2.height = iA2 - sg.bigo.ads.common.utils.e.a(context2, 8);
                    viewFindViewById.setLayoutParams(layoutParams2);
                }
                FrameLayout frameLayout = (FrameLayout) relativeLayout4.findViewById(R.id.inter_form_icon_layout);
                if (frameLayout != null) {
                    if (eVar3.j() == null) {
                        iA = 0;
                    } else {
                        iA = sg.bigo.ads.common.form.render.c.a(context2, eVar3) - sg.bigo.ads.common.utils.e.a(context2, 33);
                        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
                        layoutParams3.topMargin = iA;
                        frameLayout.setLayoutParams(layoutParams3);
                    }
                    HeightScrollView heightScrollView = (HeightScrollView) relativeLayout4.findViewById(R.id.inter_form_scroll);
                    if (heightScrollView != null) {
                        heightScrollView.setBlankView(viewFindViewById);
                        heightScrollView.setOnScrollListener(new HeightScrollView.a() { // from class: sg.bigo.ads.common.form.render.c.6

                            /* JADX INFO: renamed from: a */
                            final /* synthetic */ FrameLayout f102414a;

                            /* JADX INFO: renamed from: b */
                            final /* synthetic */ int f102415b;

                            public AnonymousClass6(FrameLayout frameLayout2, int iA3) {
                                frameLayout = frameLayout2;
                                i = iA3;
                            }

                            @Override // sg.bigo.ads.common.view.HeightScrollView.a
                            public final void a(int i13) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                                marginLayoutParams.topMargin = i - i13;
                                frameLayout.setLayoutParams(marginLayoutParams);
                            }
                        });
                    }
                }
                Button button = (Button) bVar.f102391e.findViewById(R.id.inter_form_submit);
                bVar.f102390d = button;
                if (button != null) {
                    button.setText(a.a(bVar.f102387a, R.string.bigo_ad_form_submit));
                    bVar.f102390d.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.b.3
                        public AnonymousClass3() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            View viewC;
                            GradientDrawable gradientDrawable;
                            b bVar3 = b.this;
                            bVar3.a(3, bVar3.f102393g, System.currentTimeMillis() - b.this.f102392f);
                            sg.bigo.ads.common.form.render.a.c cVar = b.this.f102389c;
                            if (cVar == null) {
                                viewC = null;
                            } else {
                                List<sg.bigo.ads.common.form.render.a.a> list = cVar.f102381g;
                                int size = list == null ? 0 : list.size();
                                for (int i13 = 0; i13 < size; i13++) {
                                    sg.bigo.ads.common.form.render.a.a aVar2 = cVar.f102381g.get(i13);
                                    if (aVar2 != null && aVar2.a()) {
                                        viewC = aVar2.c();
                                        break;
                                    }
                                }
                                viewC = null;
                            }
                            if (viewC != null) {
                                RelativeLayout relativeLayout5 = b.this.f102391e;
                                HeightScrollView heightScrollView2 = (HeightScrollView) relativeLayout5.findViewById(R.id.inter_form_scroll);
                                View viewFindViewById2 = relativeLayout5.findViewById(R.id.inter_blank_viewholder);
                                int height = viewFindViewById2 != null ? viewFindViewById2.getHeight() : 0;
                                if (heightScrollView2 != null) {
                                    heightScrollView2.scrollTo(0, viewC.getTop() + height);
                                    return;
                                }
                                return;
                            }
                            if (b.this.f102389c.b()) {
                                b bVar4 = b.this;
                                c.a(bVar4.f102391e, bVar4.f102387a, bVar4.f102388b, bVar4, 1);
                                return;
                            }
                            b bVar5 = b.this;
                            RelativeLayout relativeLayout6 = bVar5.f102391e;
                            Context context3 = bVar5.f102387a;
                            e eVar4 = bVar5.f102388b;
                            ViewGroup viewGroup3 = (ViewGroup) relativeLayout6.findViewById(R.id.inter_privacy_notice_container);
                            View viewA = sg.bigo.ads.common.utils.a.a(context3, sg.bigo.ads.common.form.render.a.a(4), null, false);
                            if (viewA != null && viewGroup3 != null) {
                                u.a(viewA, viewGroup3, null, -1);
                                TextView textView = (TextView) viewA.findViewById(R.id.bigo_ad_form_btn_cancel);
                                if (textView != null) {
                                    if (context3 == null) {
                                        gradientDrawable = null;
                                    } else {
                                        boolean z11 = sg.bigo.ads.common.form.render.a.f102361a;
                                        int i14 = z11 ? -14931661 : -1;
                                        int i15 = z11 ? -10456960 : -4009768;
                                        gradientDrawable = new GradientDrawable();
                                        gradientDrawable.setShape(0);
                                        gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(context3, 1), i15);
                                        gradientDrawable.setColor(i14);
                                        gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(context3, 8));
                                    }
                                    textView.setBackground(gradientDrawable);
                                    textView.setText(sg.bigo.ads.common.form.a.a(context3, R.string.bigo_ad_form_cancel));
                                    textView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.1

                                        /* JADX INFO: renamed from: a */
                                        final /* synthetic */ View f102402a;

                                        /* JADX INFO: renamed from: b */
                                        final /* synthetic */ a f102403b;

                                        AnonymousClass1(View viewA2, a bVar52) {
                                            view = viewA2;
                                            aVar = bVar52;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            u.b(view);
                                            a aVar3 = aVar;
                                            if (aVar3 != null) {
                                                aVar3.b();
                                            }
                                        }
                                    });
                                }
                                TextView textView2 = (TextView) viewA2.findViewById(R.id.bigo_ad_form_btn_agree);
                                if (textView2 != null) {
                                    textView2.setText(sg.bigo.ads.common.form.a.a(context3, R.string.bigo_ad_form_agree));
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.2

                                        /* JADX INFO: renamed from: a */
                                        final /* synthetic */ View f102404a;

                                        /* JADX INFO: renamed from: b */
                                        final /* synthetic */ ViewGroup f102405b;

                                        /* JADX INFO: renamed from: c */
                                        final /* synthetic */ Context f102406c;

                                        /* JADX INFO: renamed from: d */
                                        final /* synthetic */ e f102407d;

                                        /* JADX INFO: renamed from: e */
                                        final /* synthetic */ a f102408e;

                                        AnonymousClass2(View viewA2, ViewGroup relativeLayout62, Context context32, e eVar42, a bVar52) {
                                            view = viewA2;
                                            viewGroup = relativeLayout62;
                                            context = context32;
                                            eVar = eVar42;
                                            aVar = bVar52;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            u.b(view);
                                            c.a(viewGroup, context, eVar, aVar, 2);
                                            a aVar3 = aVar;
                                            if (aVar3 != null) {
                                                aVar3.c();
                                            }
                                        }
                                    });
                                }
                                PrivacyCheckBox privacyCheckBox = (PrivacyCheckBox) viewA2.findViewById(R.id.inter_form_check_box);
                                if (privacyCheckBox != null && textView2 != null) {
                                    privacyCheckBox.setOnCheckChangeListener(new PrivacyCheckBox.d() { // from class: sg.bigo.ads.common.form.render.c.3

                                        /* JADX INFO: renamed from: a */
                                        final /* synthetic */ TextView f102409a;

                                        AnonymousClass3(TextView textView22) {
                                            textView = textView22;
                                        }

                                        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.d
                                        public final void a(boolean z12) {
                                            textView.setBackgroundResource(z12 ? R.drawable.bigo_ad_btn_background : sg.bigo.ads.common.form.render.a.f102361a ? R.drawable.bigo_ad_btn_background_white_dark : R.drawable.bigo_ad_btn_background_white);
                                            textView.setClickable(z12);
                                        }
                                    });
                                }
                                c.a(viewA2, eVar42, null, bVar52);
                            }
                            b bVar6 = b.this;
                            bVar6.a(4, bVar6.f102393g, System.currentTimeMillis() - b.this.f102392f);
                        }
                    });
                }
                ViewGroup viewGroup3 = (ViewGroup) bVar.f102391e.findViewById(R.id.inter_form_content);
                if (viewGroup3 != null) {
                    sg.bigo.ads.common.form.render.a.c cVar = bVar.f102389c;
                    View viewA = sg.bigo.ads.common.utils.a.a(cVar.f102375a, sg.bigo.ads.common.form.render.a.a(5), null, false);
                    cVar.f102379e = viewA;
                    if (viewA == null) {
                        layoutParams = null;
                    } else {
                        ViewGroup viewGroup4 = (ViewGroup) viewA.findViewById(R.id.bigo_ad_id_form_question);
                        e.c[] cVarArr = cVar.f102378d;
                        if (cVarArr != null && viewGroup4 != null) {
                            int length = cVarArr.length;
                            int i13 = 0;
                            while (i13 < length) {
                                e.c cVar2 = cVarArr[i13];
                                Map<String, Object> map2 = cVar.f102376b;
                                Context context3 = cVar.f102375a;
                                if (cVar2 != null) {
                                    int i14 = cVar2.f102113b;
                                    bVar2 = i14 != i12 ? (i14 == 2 || i14 == 3) ? new sg.bigo.ads.common.form.render.a.b(cVar2, map2, context3, cVar) : null : new d(cVar2, map2, context3, cVar);
                                }
                                if (bVar2 != null) {
                                    cVar.f102381g.add(bVar2);
                                    View viewB = bVar2.b();
                                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                                    layoutParams4.bottomMargin = sg.bigo.ads.common.utils.e.a(cVar.f102375a, 27);
                                    u.a(viewB, viewGroup4, layoutParams4, -1);
                                }
                                i13++;
                                bVar2 = null;
                                i12 = 1;
                            }
                        }
                        TextView textView = (TextView) cVar.f102379e.findViewById(R.id.inter_form_question_purpose);
                        if (textView != null) {
                            textView.setText(cVar.f102377c.h());
                        }
                        cVar.f102380f = sg.bigo.ads.common.form.render.c.a(cVar.f102379e, cVar.f102377c, cVar.f102376b, cVar.f102382h);
                        view = cVar.f102379e;
                        layoutParams = null;
                    }
                    u.a(view, viewGroup3, layoutParams, -1);
                }
            }
            u.a(bVar.f102391e, new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.common.form.render.b.2
                public AnonymousClass2() {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    sg.bigo.ads.common.n.d.a(2, b.this.f102394h);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    b bVar3 = b.this;
                    bVar3.a(12, bVar3.f102393g, System.currentTimeMillis() - b.this.f102392f);
                }
            });
            relativeLayout = bVar.f102391e;
        }
        c cVar3 = new c(relativeLayout, bVar);
        cVar3.f102358d.setType(0);
        cVar3.f102358d.setRadius(sg.bigo.ads.common.utils.e.a(context, 3));
        cVar3.f102358d.setPadding(sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 3));
        cVar3.f102357c.setViewStyle(3);
        cVar3.f102357c.setFlipInterval(5000);
        cVar3.f102357c.setOnItemChangeListener(new ViewFlow.c() { // from class: sg.bigo.ads.common.form.c.1
            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(int i15) {
                Indicator indicator;
                int i16;
                c.this.f102358d.setNum(i15);
                if (i15 > 1) {
                    indicator = c.this.f102358d;
                    i16 = 0;
                } else {
                    indicator = c.this.f102358d;
                    i16 = 4;
                }
                indicator.setVisibility(i16);
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(int i15, int i16) {
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(@NonNull View view2, int i15) {
                c.this.f102358d.a(i15);
            }

            @Override // sg.bigo.ads.common.view.ViewFlow.c
            public final void a(@NonNull View view2, int i15, float f10) {
                c.this.f102358d.a(f10, i15);
            }
        });
        cVar3.f102357c.getLayoutParams().height = sg.bigo.ads.common.form.render.c.a(context, eVar);
        f[] fVarArrI = eVar.i();
        if (!k.a(fVarArrI)) {
            for (f fVar : fVarArrI) {
                ImageView imageView2 = new ImageView(context);
                new sg.bigo.ads.common.p.b(imageView2).a(null, fVar.c(), false);
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ViewFlow.b bVar3 = new ViewFlow.b();
                ((ViewGroup.LayoutParams) bVar3).width = -1;
                ((ViewGroup.LayoutParams) bVar3).height = -2;
                bVar3.f102998e = 48;
                bVar3.f102997d = 3;
                cVar3.f102357c.addView(imageView2, bVar3);
                if (eVar.f() == 0) {
                    break;
                }
            }
        }
        return cVar3;
    }
}
