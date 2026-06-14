package com.applovin.impl;

import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.C4605wc;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC5017cf;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class x4 implements Comparable {
    public static final x4 A;
    public static final x4 A0;
    public static final x4 A1;
    public static final x4 A2;
    public static final x4 A3;
    public static final x4 A4;
    public static final x4 A5;
    public static final x4 A6;
    public static final x4 B;
    public static final x4 B0;
    public static final x4 B1;
    public static final x4 B2;
    public static final x4 B3;
    public static final x4 B4;
    public static final x4 B5;
    public static final x4 B6;
    public static final x4 C;
    public static final x4 C0;
    public static final x4 C1;
    public static final x4 C2;
    public static final x4 C3;
    public static final x4 C4;
    public static final x4 C5;
    public static final x4 C6;
    public static final x4 D;
    public static final x4 D0;
    public static final x4 D1;
    public static final x4 D2;
    public static final x4 D3;
    public static final x4 D4;
    public static final x4 D5;
    public static final x4 D6;
    public static final x4 E;
    public static final x4 E0;
    public static final x4 E1;
    public static final x4 E2;
    public static final x4 E3;
    public static final x4 E4;
    public static final x4 E5;
    public static final x4 E6;
    public static final x4 F;
    public static final x4 F0;
    public static final x4 F1;
    public static final x4 F2;
    public static final x4 F3;
    public static final x4 F4;
    public static final x4 F5;
    public static final x4 F6;
    public static final x4 G;
    public static final x4 G0;
    public static final x4 G1;
    public static final x4 G2;
    public static final x4 G3;
    public static final x4 G4;
    public static final x4 G5;
    public static final x4 G6;
    public static final x4 H;
    public static final x4 H0;
    public static final x4 H1;
    public static final x4 H2;
    public static final x4 H3;
    public static final x4 H4;
    public static final x4 H5;
    public static final x4 H6;
    public static final x4 I;
    public static final x4 I0;
    public static final x4 I1;
    public static final x4 I2;
    public static final x4 I3;
    public static final x4 I4;
    public static final x4 I5;
    public static final x4 I6;
    public static final x4 J;
    public static final x4 J0;
    public static final x4 J1;
    public static final x4 J2;
    public static final x4 J3;
    public static final x4 J4;
    public static final x4 J5;
    public static final x4 J6;
    public static final x4 K;
    public static final x4 K0;
    public static final x4 K1;
    public static final x4 K2;
    public static final x4 K3;
    public static final x4 K4;
    public static final x4 K5;
    public static final x4 K6;
    public static final x4 L;
    public static final x4 L0;
    public static final x4 L1;
    public static final x4 L2;
    public static final x4 L3;
    public static final x4 L4;
    public static final x4 L5;
    public static final x4 L6;
    public static final x4 M;
    public static final x4 M0;
    public static final x4 M1;
    public static final x4 M2;
    public static final x4 M3;
    public static final x4 M4;
    public static final x4 M5;
    public static final x4 M6;
    public static final x4 N;
    public static final x4 N0;
    public static final x4 N1;
    public static final x4 N2;
    public static final x4 N3;
    public static final x4 N4;
    public static final x4 N5;
    public static final x4 N6;
    public static final x4 O;
    public static final x4 O0;
    public static final x4 O1;
    public static final x4 O2;
    public static final x4 O3;
    public static final x4 O4;
    public static final x4 O5;
    public static final x4 O6;
    public static final x4 P;
    public static final x4 P0;
    public static final x4 P1;
    public static final x4 P2;
    public static final x4 P3;
    public static final x4 P4;
    public static final x4 P5;
    public static final x4 P6;
    public static final x4 Q;
    public static final x4 Q0;
    public static final x4 Q1;
    public static final x4 Q2;
    public static final x4 Q3;
    public static final x4 Q4;
    public static final x4 Q5;
    public static final x4 Q6;
    public static final x4 R;
    public static final x4 R0;
    public static final x4 R1;
    public static final x4 R2;
    public static final x4 R3;
    public static final x4 R4;
    public static final x4 R5;
    public static final x4 R6;
    public static final x4 S;
    public static final x4 S0;
    public static final x4 S1;
    public static final x4 S2;
    public static final x4 S3;
    public static final x4 S4;
    public static final x4 S5;
    public static final x4 S6;
    public static final x4 T;
    public static final x4 T0;
    public static final x4 T1;
    public static final x4 T2;
    public static final x4 T3;
    public static final x4 T4;
    public static final x4 T5;
    public static final x4 T6;
    public static final x4 U;
    public static final x4 U0;
    public static final x4 U1;
    public static final x4 U2;
    public static final x4 U3;
    public static final x4 U4;
    public static final x4 U5;
    public static final x4 U6;
    public static final x4 V;
    public static final x4 V0;
    public static final x4 V1;
    public static final x4 V2;
    public static final x4 V3;
    public static final x4 V4;
    public static final x4 V5;
    public static final x4 V6;
    public static final x4 W;
    public static final x4 W0;
    public static final x4 W1;
    public static final x4 W2;
    public static final x4 W3;
    public static final x4 W4;
    public static final x4 W5;
    public static final x4 W6;
    public static final x4 X;
    public static final x4 X0;
    public static final x4 X1;
    public static final x4 X2;
    public static final x4 X3;
    public static final x4 X4;
    public static final x4 X5;
    public static final x4 X6;
    public static final x4 Y;
    public static final x4 Y0;
    public static final x4 Y1;
    public static final x4 Y2;
    public static final x4 Y3;
    public static final x4 Y4;
    public static final x4 Y5;
    public static final x4 Y6;
    public static final x4 Z;
    public static final x4 Z0;
    public static final x4 Z1;
    public static final x4 Z2;
    public static final x4 Z3;
    public static final x4 Z4;
    public static final x4 Z5;
    public static final x4 Z6;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final x4 f11261a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final x4 f11262a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final x4 f11263a2;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final x4 f11264a3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final x4 f11265a4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final x4 f11266a5;

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public static final x4 f11267a6;

    /* JADX INFO: renamed from: a7, reason: collision with root package name */
    public static final x4 f11268a7;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final x4 f11269b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final x4 f11270b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final x4 f11271b2;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final x4 f11272b3;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final x4 f11273b4;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final x4 f11274b5;

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public static final x4 f11275b6;

    /* JADX INFO: renamed from: b7, reason: collision with root package name */
    public static final x4 f11276b7;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final x4 f11278c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final x4 f11279c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final x4 f11280c2;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final x4 f11281c3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final x4 f11282c4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final x4 f11283c5;

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public static final x4 f11284c6;

    /* JADX INFO: renamed from: c7, reason: collision with root package name */
    public static final x4 f11285c7;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final x4 f11287d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final x4 f11288d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final x4 f11289d2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final x4 f11290d3;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final x4 f11291d4;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final x4 f11292d5;

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public static final x4 f11293d6;

    /* JADX INFO: renamed from: d7, reason: collision with root package name */
    public static final x4 f11294d7;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x4 f11295e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final x4 f11296e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final x4 f11297e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final x4 f11298e2;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final x4 f11299e3;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final x4 f11300e4;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final x4 f11301e5;

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    public static final x4 f11302e6;

    /* JADX INFO: renamed from: e7, reason: collision with root package name */
    public static final x4 f11303e7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x4 f11304f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final x4 f11305f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final x4 f11306f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final x4 f11307f2;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final x4 f11308f3;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final x4 f11309f4;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final x4 f11310f5;

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    public static final x4 f11311f6;

    /* JADX INFO: renamed from: f7, reason: collision with root package name */
    public static final x4 f11312f7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x4 f11313g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final x4 f11314g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final x4 f11315g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public static final x4 f11316g2;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final x4 f11317g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final x4 f11318g4;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final x4 f11319g5;

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    public static final x4 f11320g6;

    /* JADX INFO: renamed from: g7, reason: collision with root package name */
    public static final x4 f11321g7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x4 f11322h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final x4 f11323h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final x4 f11324h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final x4 f11325h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final x4 f11326h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final x4 f11327h4;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final x4 f11328h5;

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    public static final x4 f11329h6;

    /* JADX INFO: renamed from: h7, reason: collision with root package name */
    public static final x4 f11330h7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x4 f11331i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final x4 f11332i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final x4 f11333i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final x4 f11334i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final x4 f11335i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final x4 f11336i4;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final x4 f11337i5;

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    public static final x4 f11338i6;

    /* JADX INFO: renamed from: i7, reason: collision with root package name */
    public static final x4 f11339i7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x4 f11340j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final x4 f11341j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final x4 f11342j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final x4 f11343j2;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final x4 f11344j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final x4 f11345j4;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final x4 f11346j5;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    public static final x4 f11347j6;

    /* JADX INFO: renamed from: j7, reason: collision with root package name */
    public static final x4 f11348j7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final x4 f11349k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final x4 f11350k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final x4 f11351k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final x4 f11352k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final x4 f11353k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final x4 f11354k4;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final x4 f11355k5;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    public static final x4 f11356k6;

    /* JADX INFO: renamed from: k7, reason: collision with root package name */
    public static final x4 f11357k7;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x4 f11358l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final x4 f11359l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final x4 f11360l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final x4 f11361l2;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final x4 f11362l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final x4 f11363l4;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final x4 f11364l5;

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    public static final x4 f11365l6;

    /* JADX INFO: renamed from: l7, reason: collision with root package name */
    public static final x4 f11366l7;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x4 f11367m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final x4 f11368m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final x4 f11369m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final x4 f11370m2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final x4 f11371m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final x4 f11372m4;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final x4 f11373m5;

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    public static final x4 f11374m6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x4 f11375n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final x4 f11376n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final x4 f11377n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final x4 f11378n2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final x4 f11379n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final x4 f11380n4;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final x4 f11381n5;

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    public static final x4 f11382n6;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x4 f11383o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final x4 f11384o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final x4 f11385o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final x4 f11386o2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final x4 f11387o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final x4 f11388o4;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final x4 f11389o5;

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    public static final x4 f11390o6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final x4 f11391p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final x4 f11392p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final x4 f11393p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final x4 f11394p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final x4 f11395p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final x4 f11396p4;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final x4 f11397p5;

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    public static final x4 f11398p6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final x4 f11399q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final x4 f11400q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final x4 f11401q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final x4 f11402q2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final x4 f11403q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    public static final x4 f11404q4;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final x4 f11405q5;

    /* JADX INFO: renamed from: q6, reason: collision with root package name */
    public static final x4 f11406q6;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x4 f11407r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final x4 f11408r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final x4 f11409r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final x4 f11410r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final x4 f11411r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    public static final x4 f11412r4;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final x4 f11413r5;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    public static final x4 f11414r6;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x4 f11415s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final x4 f11416s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final x4 f11417s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final x4 f11418s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final x4 f11419s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final x4 f11420s4;

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final x4 f11421s5;

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    public static final x4 f11422s6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x4 f11423t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final x4 f11424t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final x4 f11425t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final x4 f11426t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final x4 f11427t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final x4 f11428t4;

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final x4 f11429t5;

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    public static final x4 f11430t6;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final x4 f11431u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final x4 f11432u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final x4 f11433u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final x4 f11434u2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final x4 f11435u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final x4 f11436u4;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public static final x4 f11437u5;

    /* JADX INFO: renamed from: u6, reason: collision with root package name */
    public static final x4 f11438u6;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x4 f11439v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final x4 f11440v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final x4 f11441v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final x4 f11442v2;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final x4 f11443v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final x4 f11444v4;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final x4 f11445v5;

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    public static final x4 f11446v6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x4 f11447w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final x4 f11448w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final x4 f11449w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final x4 f11450w2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final x4 f11451w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final x4 f11452w4;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public static final x4 f11453w5;

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    public static final x4 f11454w6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final x4 f11455x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final x4 f11456x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final x4 f11457x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final x4 f11458x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final x4 f11459x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final x4 f11460x4;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public static final x4 f11461x5;

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    public static final x4 f11462x6;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final x4 f11463y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final x4 f11464y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final x4 f11465y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final x4 f11466y2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final x4 f11467y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final x4 f11468y4;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public static final x4 f11469y5;

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    public static final x4 f11470y6;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final x4 f11471z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final x4 f11472z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final x4 f11473z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final x4 f11474z2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final x4 f11475z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final x4 f11476z4;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final x4 f11477z5;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public static final x4 f11478z6;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f11480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f11277c = Arrays.asList(Boolean.class, Float.class, Double.class, Integer.class, Long.class, String.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f11286d = new HashMap(512);

    static {
        Boolean bool = Boolean.FALSE;
        f11295e = a("is_disabled", bool);
        f11304f = a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        f11313g = a("rss", bool2);
        f11322h = a("rssoitf", bool);
        f11331i = a("cpoitf", bool);
        f11340j = a("device_token", "");
        f11349k = a("is_verbose_logging", bool);
        f11358l = a("sc", "");
        f11367m = a("sc2", "");
        f11375n = a("sc3", "");
        f11383o = a("server_installed_at", "");
        f11391p = a("clear_completion_callback_on_failure", bool);
        f11399q = a("sicd_ms", 0L);
        f11407r = a("logcat_max_line_size", 1000);
        f11415s = a("exception_handler_enabled", bool2);
        f11423t = a("md", "");
        f11431u = a("lsu", bool);
        f11439v = a("tla_ms", -1L);
        f11447w = a("uactlac", bool);
        f11455x = a("vsk", bool);
        f11463y = a("avt_ms", -1L);
        f11471z = a("avsves", bool);
        A = a("avrctr", "");
        B = a("error_reporter_v1_sample_percent", 100);
        C = a("health_events_reporter_v1_endpoint", "https://sts.applovin.com/v1/stats/sdk");
        D = a("health_events_reporter_v1_event_level_sampling_percentages", "");
        Float fValueOf = Float.valueOf(-1.0f);
        E = a("health_events_reporter_v1_ad_sampling_percent", fValueOf);
        F = a("health_events_reporter_v1_error_sampling_percent", fValueOf);
        G = a("health_events_reporter_v1_user_session_sampling_percent", fValueOf);
        H = a("health_events_reporter_v1_sampling_percent", Float.valueOf(1.0f));
        I = a("health_events_reporter_v1_batch_grouped_events", bool);
        J = a("health_events_reporter_should_skip_al_events_in_max", bool);
        K = a("health_events_reporter_valid_network_status_codes", "");
        L = a("health_events_reporter_include_cached_asset_info", bool);
        M = a("health_events_reporter_include_html_source", bool);
        N = a("stps", 2);
        O = a("auxiliary_operations_threads", 1);
        P = a("apsobt", bool2);
        Q = a("tmtp", 1);
        R = a("network_thread_count", 2);
        S = a("ntp", 5);
        T = a("ueq", bool);
        U = a("coretc", 1);
        V = a("cachetc", 1);
        W = a("mtc", 1);
        X = a("ttc", 1);
        Y = a("otc", 1);
        Z = a("uaeq", bool);
        f11261a0 = a("init_omsdk", bool2);
        f11269b0 = a("omsdk_partner_name", "applovin");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f11278c0 = a("ttc_max_click_duration_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f11287d0 = a("ttc_max_click_distance_dp", 10);
        AppLovinTouchToClickListener.ClickRecognitionState clickRecognitionState = AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN;
        f11296e0 = a("ttc_acrsv2a", Integer.valueOf(clickRecognitionState.ordinal()));
        f11305f0 = a("ttc_acrsnv", Integer.valueOf(clickRecognitionState.ordinal()));
        f11314g0 = a("ttc_acrsn", Integer.valueOf(clickRecognitionState.ordinal()));
        f11323h0 = a("ttc_edge_buffer_dp", 0);
        f11332i0 = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        f11341j0 = a("fetch_settings_endpoint", "https://ms.applovin.com/");
        f11350k0 = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        f11359l0 = a("adserver_endpoint", "https://a.applovin.com/");
        f11368m0 = a("adserver_backup_endpoint", "https://a.applvn.com/");
        f11376n0 = a("api_endpoint", "https://d.applovin.com/");
        f11384o0 = a("api_backup_endpoint", "https://d.applvn.com/");
        f11392p0 = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        f11400q0 = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        f11408r0 = a("eete", "https://b.applovin.com/");
        f11416s0 = a("eetbe", "");
        f11424t0 = a("webview_network_error_endpoints_to_report", "applovin.com,applvn.com");
        f11432u0 = a("vle", "");
        f11440v0 = a("vlbe", "");
        f11448w0 = a("vlep", "");
        f11456x0 = a("token_type_prefixes_r", "4!");
        f11464y0 = a("token_type_prefixes_arj", "json_v3!");
        f11472z0 = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
        A0 = a("axon_events", tc.a(StringUtils.COMMA, new CharSequence[]{"rewarded_ad_opportunity", "ad_view", "ad_clicked", "page_view", FirebaseAnalytics.Event.VIEW_ITEM, FirebaseAnalytics.Event.ADD_TO_CART, FirebaseAnalytics.Event.BEGIN_CHECKOUT, FirebaseAnalytics.Event.PURCHASE, FirebaseAnalytics.Event.ADD_PAYMENT_INFO, FirebaseAnalytics.Event.REMOVE_FROM_CART, FirebaseAnalytics.Event.VIEW_CART, "wishlist_updated", "refund_requested", "financial_deposit", "financial_withdraw", "financial_transaction", FirebaseAnalytics.Event.LEVEL_START, "level_complete", "level_fail", "virtual_resource_transaction", FirebaseAnalytics.Event.TUTORIAL_COMPLETE, "energy_depleted", "use_prop", "game_shop_enter", FirebaseAnalytics.Event.GENERATE_LEAD, "login", FirebaseAnalytics.Event.SIGN_UP, "search", "product_review", FirebaseAnalytics.Event.APP_OPEN, "account_verification_start", "account_verification_complete", C4424m2.f43622u, "account_linked", "friend_invite", "gift_transaction", "group_joined", "chat_sent", "post_view", "post_created", "subscribe", "start_trial"}));
        B0 = a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1L)));
        C0 = a("cache_max_size_mb", -1);
        D0 = a("precache_delimiters", ")]', ");
        E0 = a("ad_resource_caching_enabled", bool2);
        F0 = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        G0 = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        H0 = a("resource_max_filename_length", 255);
        I0 = a("ccrc", bool);
        J0 = a("ustpfcrc", bool);
        K0 = a("mcct", 3);
        L0 = a("mchct", 3);
        M0 = a("dfirf", bool);
        N0 = a("dfipf", bool);
        O0 = a("dcrome", bool);
        P0 = a("dcrobs", bool);
        Q0 = a("pcro", bool);
        R0 = a("serfaad", bool);
        S0 = a("mdafra", 1);
        T0 = a("ssch", bool2);
        U0 = a("suaf", bool);
        V0 = a("lfblrs", bool);
        W0 = a("pawnrrm", bool);
        X0 = a("ape", bool);
        Y0 = a("pafqi", bool);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        Z0 = a("pae_ms", Long.valueOf(timeUnit2.toMillis(5L)));
        f11262a1 = a("pamttl_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f11270b1 = a("saewib", bool);
        f11279c1 = a("fsae_ms", -1L);
        f11288d1 = a("raae", bool);
        f11297e1 = a("vr_retry_count_v1", 1);
        f11306f1 = a("cr_retry_count_v1", 1);
        f11315g1 = a("saru", bool);
        f11324h1 = a("spvtzians", bool);
        f11333i1 = a("close_button_touch_area", 0);
        f11342j1 = a("close_button_outside_touch_area", 0);
        f11351k1 = a("creative_debugger_enabled", bool2);
        f11360l1 = a("smdfhcdb", bool2);
        f11369m1 = a("use_background_view_for_ad_clicks", bool2);
        f11377n1 = a("viewability_adview_imp_delay_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f11385o1 = a("viewability_adview_banner_min_width", 320);
        f11393p1 = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        f11401q1 = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        f11409r1 = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        f11417s1 = a("viewability_adview_leader_min_width", 728);
        f11425t1 = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        f11433u1 = a("viewability_adview_native_min_width", 0);
        f11441v1 = a("viewability_adview_native_min_height", 0);
        f11449w1 = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        f11457x1 = a("viewability_timer_min_visible_ms", Long.valueOf(timeUnit.toMillis(1L)));
        f11465y1 = a("viewability_timer_interval_ms", 100L);
        f11473z1 = a("expandable_close_button_size", 27);
        A1 = a("expandable_h_close_button_margin", 10);
        B1 = a("expandable_t_close_button_margin", 10);
        C1 = a("expandable_lhs_close_button", bool);
        D1 = a("expandable_close_button_touch_area", 0);
        E1 = a("forward_lifecycle_events_to_adview_webview", bool);
        F1 = a("forward_in_app_browser_events_to_adview_webview", bool);
        G1 = a("forward_external_redirect_events_to_adview_webview", bool);
        H1 = a("forward_preload_events_to_adview_webview", bool);
        I1 = a("iaad", bool);
        J1 = a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        K1 = a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(timeUnit2.toMillis(2L)));
        L1 = a("lhs_close_button_video", bool);
        M1 = a("close_button_right_margin_video", 4);
        N1 = a("close_button_size_video", 30);
        O1 = a("close_button_top_margin_video", 8);
        P1 = a("video_countdown_clock_margin", 10);
        Q1 = a("video_countdown_clock_gravity", 83);
        R1 = a("countdown_clock_size", 32);
        S1 = a("countdown_clock_stroke_size", 4);
        T1 = a("countdown_clock_text_size", 28);
        U1 = a("draw_countdown_clock", bool2);
        V1 = a("inter_display_delay", 200L);
        W1 = a("maximum_close_button_delay_seconds", 999L);
        X1 = a("respect_close_button", bool2);
        Y1 = a("lhs_skip_button", bool2);
        Z1 = a("mute_controls_enabled", bool);
        f11263a2 = a("allow_user_muting", bool2);
        f11271b2 = a("mute_videos", bool);
        f11280c2 = a("show_mute_by_default", bool);
        f11289d2 = a("mute_with_user_settings", bool2);
        f11298e2 = a("mute_button_size", 32);
        f11307f2 = a("mute_button_margin", 10);
        f11316g2 = a("mute_button_gravity", 85);
        f11325h2 = a("progress_bar_step", 25L);
        f11334i2 = a("progress_bar_scale", 10000);
        f11343j2 = a("progress_bar_vertical_padding", -8);
        f11352k2 = a("vs_buffer_indicator_size", 50);
        f11361l2 = a("video_zero_length_as_computed", bool);
        f11370m2 = a("set_poststitial_muted_initial_delay_ms", 500L);
        f11378n2 = a("fsahrpg", bool2);
        f11386o2 = a("eaafrwsoa", bool2);
        f11394p2 = a("postitial_progress_bar_step_ms", 25L);
        f11402q2 = a("postitial_progress_bar_on_bottom", bool2);
        f11410r2 = a("postitial_progress_bar_vertical_padding", -8);
        f11418s2 = a("postitial_progress_bar_scale", 10000);
        f11426t2 = a("fahosu", bool);
        f11434u2 = a("system_insets_mask", Integer.valueOf(n7.g()));
        f11442v2 = a("system_bars_hide_list", "");
        f11450w2 = a("aarwdc", bool);
        f11458x2 = a("track_app_killed", bool);
        f11466y2 = a("track_ad_duration", bool);
        f11474z2 = a("track_ad_duration_interval_ms", Long.valueOf(timeUnit.toMillis(1L)));
        A2 = a("simplified_app_killed_detection", bool);
        B2 = a("app_closed_time_threshold_for_app_killed_event_ms", Long.valueOf(timeUnit.toMillis(60L)));
        C2 = a("track_app_killed_during_mediated_ad", bool);
        D2 = a("track_mediated_ad_duration_interval_ms", -1L);
        E2 = a("app_closed_time_threshold_for_app_killed_during_mediated_ad_event_ms", Long.valueOf(timeUnit.toMillis(60L)));
        F2 = a("nsuttcl", bool);
        G2 = a("submit_postback_timeout", Integer.valueOf((int) timeUnit.toMillis(10L)));
        H2 = a("submit_postback_retries", 4);
        I2 = a("max_postback_attempts", 3);
        J2 = a("max_persisted_postbacks", 100);
        K2 = a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit.toMillis(7L)));
        L2 = a("sossp", bool);
        M2 = a("spp", bool2);
        N2 = a("fire_native_ad_postbacks_from_webview", bool);
        O2 = a("use_requests_for_native_ad_click_postbacks", bool);
        P2 = a("preload_postback_webview", bool);
        Q2 = a("sejwp", bool);
        R2 = a("ejt_ms", Long.valueOf(timeUnit.toMillis(5L)));
        S2 = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit.toMillis(10L)));
        T2 = a("http_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        U2 = a("http_socket_timeout", Integer.valueOf((int) timeUnit.toMillis(20L)));
        V2 = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        W2 = a("fetch_ad_retry_count_v1", 1);
        X2 = a("faer", bool);
        Y2 = a("faroae", bool);
        Z2 = a("submit_data_retry_count_v1", 1);
        f11264a3 = a("response_buffer_size", 16000);
        f11272b3 = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f11281c3 = a("fetch_basic_settings_retry_count", 3);
        f11290d3 = a("fetch_basic_settings_on_reconnect", bool);
        f11299e3 = a("skip_fetch_basic_settings_if_not_connected", bool);
        f11308f3 = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit.toMillis(2L)));
        f11317g3 = a("idflrwbe", bool);
        f11326h3 = a("falawpr", bool);
        f11335i3 = a("sort_query_parameters", bool);
        f11344j3 = a("communicator_request_timeout_ms", Long.valueOf(timeUnit.toMillis(10L)));
        f11353k3 = a("communicator_request_retry_count", 3);
        f11362l3 = a("communicator_request_retry_delay_ms", Long.valueOf(timeUnit.toMillis(2L)));
        f11371m3 = a("rfbsd_ms", -1L);
        f11379n3 = a("ehkpd_ms", 500L);
        f11387o3 = a("rironc", bool);
        f11395p3 = a("rroncbd", bool);
        f11403q3 = a("wverc_ms", Long.valueOf(timeUnit.toMillis(5L)));
        f11411r3 = a("scrsifm", bool);
        f11419s3 = a("suohfrl", bool);
        f11427t3 = a("lvrc", 1);
        f11435u3 = a("session_tracking_cooldown_on_event_fire", bool2);
        f11443v3 = a("session_tracking_resumed_cooldown_minutes", 90L);
        f11451w3 = a("session_tracking_paused_cooldown_minutes", 90L);
        f11459x3 = a("qq", bool);
        f11467y3 = a("qq1", bool2);
        f11475z3 = a("qq2", bool);
        A3 = a("qq3", bool2);
        B3 = a("qq4", bool2);
        C3 = a("qq5", bool2);
        D3 = a("qq6", bool2);
        E3 = a("qq7", bool2);
        F3 = a("qq8", bool2);
        G3 = a("qq9", bool);
        H3 = a("qq10", bool2);
        I3 = a("qq11", bool2);
        J3 = a("qq12", bool2);
        K3 = a("pui", bool2);
        L3 = a("plugin_version", "");
        M3 = a("validate_admob_adapter_sdk_version", bool2);
        N3 = a("ccbtbsic", bool);
        O3 = a("hgn", bool2);
        P3 = a("cso", bool2);
        Q3 = a("cfs", bool2);
        R3 = a("cmi", bool2);
        S3 = a("crat", bool2);
        T3 = a("cvs", bool2);
        U3 = a("caf", bool2);
        V3 = a(AbstractC5017cf.f76969c, bool2);
        W3 = a("cmtl", bool2);
        X3 = a("cnr", bool2);
        Y3 = a("ccr", bool);
        Z3 = a("adr", bool2);
        f11265a4 = a("volume_normalization_factor", Float.valueOf(100.0f));
        f11273b4 = a("system_user_agent_collection_enabled", bool);
        f11282c4 = a("user_agent_collection_enabled", bool);
        f11291d4 = a("use_cached_user_agent_as_default", bool2);
        f11300e4 = a("collect_device_angle", bool2);
        f11309f4 = a("collect_device_movement", bool2);
        f11318g4 = a("movement_degradation", Float.valueOf(0.75f));
        f11327h4 = a("device_sensor_period_ms", 250);
        f11336i4 = a("mps", "");
        f11345j4 = a("mpsl", 3);
        f11354k4 = a(C4605wc.f45740c, "com.applovin,dalvik,java,android,com.android");
        f11363l4 = a("cmps", bool);
        f11372m4 = a("rmps", bool);
        f11380n4 = a("collect_webview_package_info", bool);
        f11388o4 = a("webview_package_names", "com.google.android.webview,com.android.webview");
        f11396p4 = a("collect_opengl_version", bool);
        f11404q4 = a("ncre", bool);
        f11412r4 = a("ncrs", "4,5,6,7,8,11,16");
        f11420s4 = a("ncrcs", bool);
        f11428t4 = a("ncrcai", bool2);
        f11436u4 = a("tmas", "");
        f11444v4 = a("tmasl", "");
        f11452w4 = a("tmahl", 1);
        f11460x4 = a("cin_v2", bool);
        f11468y4 = a("suia", bool2);
        f11476z4 = a("asicl", 1);
        A4 = a("aeicl", 1);
        B4 = a("aeisupf", bool);
        C4 = a("aeistl", -1);
        D4 = a("aeistsr", "5");
        E4 = a("csbi", bool);
        F4 = a("btt_ms", Long.valueOf(timeUnit.toMillis(20L)));
        G4 = a("chs", bool);
        H4 = a("dltc", "");
        I4 = a("sy_stc", JsonUtils.EMPTY_JSON);
        J4 = a("se_stc", JsonUtils.EMPTY_JSON);
        K4 = a("gl_stc", JsonUtils.EMPTY_JSON);
        L4 = a("crpaf", bool);
        M4 = a("umsm", bool);
        N4 = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        O4 = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        P4 = a("vast_max_response_length", 640000);
        Q4 = a("vast_max_wrapper_depth", 5);
        R4 = a("vast_unsupported_video_extensions", "ogv,flv");
        S4 = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        T4 = a("vast_validate_with_extension_if_no_video_type", bool2);
        U4 = a("vast_wrapper_resolution_retry_count_v1", 1);
        V4 = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        W4 = a("vast_industry_icon_max_size", 20);
        X4 = a("vast_industry_icon_margin", 12);
        Y4 = a("vast_industry_icon_gravity", 85);
        Z4 = a("vast_native_mute_button_size", 24);
        f11266a5 = a("vast_native_play_pause_button_size", 24);
        f11274b5 = a("vast_native_video_widget_padding", 6);
        f11283c5 = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
        f11292d5 = a("vast_native_video_widgets_enabled", bool2);
        f11301e5 = a("vast_replay_video_upon_completion", bool2);
        f11310f5 = a("vast_replay_icon_size", 64);
        f11319g5 = a("vcjfhr", bool);
        f11328h5 = a("vcjfhrr", "(?:<|%3C)script[^>]*src=\"(https[^\"]*\\.js[^\"]*)\".*?(?:>|%3E)");
        f11337i5 = a("vpenfxr", "(<Error><!\\[CDATA\\[[^>]*><\\/Error>)");
        f11346j5 = a("vast_fire_trackers_from_webview", bool);
        f11355k5 = a("ree", bool2);
        u4.a aVar = u4.a.DEFAULT;
        f11364l5 = a("ree_t", Integer.valueOf(aVar.b()));
        f11373m5 = a("btee", bool2);
        f11381n5 = a("btet", Integer.valueOf(aVar.b()));
        f11389o5 = a("reetoa", bool);
        f11397p5 = a("reet_msfs", Integer.valueOf(aVar.b()));
        u4.a aVar2 = u4.a.V2;
        f11405q5 = a("reet_msma", Integer.valueOf(aVar2.b()));
        f11413r5 = a("reet_msmd", Integer.valueOf(aVar.b()));
        f11421s5 = a("reet_asfp", Integer.valueOf(aVar.b()));
        f11429t5 = a("reet_asfg", Integer.valueOf(aVar.b()));
        f11437u5 = a("reet_aset", Integer.valueOf(aVar.b()));
        f11445v5 = a("reet_asaet", Integer.valueOf(aVar2.b()));
        f11453w5 = a("reet_esdi", Integer.valueOf(aVar.b()));
        f11461x5 = a("reet_esrp", Integer.valueOf(aVar.b()));
        f11469y5 = a("reet_lv", Integer.valueOf(aVar2.b()));
        f11477z5 = a("apdra", bool);
        A5 = a("apdrfs", bool);
        B5 = a("apdrma", bool);
        C5 = a("apdrmd", bool);
        D5 = a("apdrfa", bool);
        E5 = a("apdrev", bool);
        F5 = a("apdrdi", bool);
        G5 = a("apdrrp", bool);
        H5 = a("server_timestamp_ms", 0L);
        I5 = a("device_timestamp_ms", 0L);
        J5 = a("gzip_min_length", 0);
        K5 = a("gzip_encoding_default", bool);
        L5 = a("fetch_settings_gzip", bool);
        M5 = a("device_init_gzip", bool);
        N5 = a("fetch_ad_gzip", bool);
        O5 = a("event_tracking_gzip", bool);
        P5 = a("reward_postback_gzip", bool);
        Q5 = a("avg", bool);
        R5 = a("handle_render_process_gone", bool2);
        S5 = a("rworpg", bool2);
        T5 = a("fdadaomr", bool2);
        U5 = a("vfswccar", bool);
        V5 = a("sparafad", bool);
        W5 = a("fahctdmr", bool);
        X5 = a("mmcarc", bool);
        Y5 = a("teorpc", bool);
        Z5 = a("set_webview_render_process_client", bool);
        f11267a6 = a("disable_webview_hardware_acceleration", bool);
        f11275b6 = a("anr_detection_enabled", bool);
        f11284c6 = a("anr_trigger_millis", 4000L);
        f11293d6 = a("anr_touch_millis", 3000L);
        f11302e6 = a("anr_check_millis", 3000L);
        f11311f6 = a("spadib", bool);
        f11320g6 = a("uobid", bool2);
        f11329h6 = a("bvde", bool);
        f11338i6 = a("bvdidm", 1000L);
        f11347j6 = a("bvdim", 4000L);
        f11356k6 = a("bvdrs", 10);
        f11365l6 = a("bvdct", 230);
        f11374m6 = a("bvdict", 3);
        f11382n6 = a("bvad", bool);
        f11390o6 = a("bvebb", bool2);
        f11398p6 = a("bvscb", bool2);
        f11406q6 = a("bvlmtb", -1L);
        f11414r6 = a("bvsafw", bool2);
        f11422s6 = a("bvdtr", 2);
        f11430t6 = a("bvdtc", 2);
        f11438u6 = a("aocve", bool);
        f11446v6 = a("dwvvb", bool);
        f11454w6 = a("stcpc", bool);
        f11462x6 = a("stcic", bool2);
        f11470y6 = a("qjscwwvl", bool);
        f11478z6 = a("web_contents_debugging_enabled", bool);
        A6 = a("fcioiauiidb", bool2);
        B6 = a("teouauiidb", bool2);
        C6 = a("usc", bool);
        D6 = a("should_apply_web_view_settings_to_web_view_button", bool);
        E6 = a("should_use_cached_screen_size_for_foldable_devices", bool2);
        F6 = a("should_persist_shared_prefs_with_background_commit", bool);
        G6 = a("wvmldt", -1);
        H6 = a("fmldt", -1);
        I6 = a("csl", -1);
        J6 = a("should_use_applovin_adaptive_sizing_formula", bool);
        K6 = a("cdbpn", bool);
        L6 = a("cavdi", bool);
        M6 = a("pvdiaqp", bool);
        N6 = a("sudbia", bool);
        O6 = a("pbpn", "");
        P6 = a("nvelifapd", bool);
        Q6 = a("sufecfhrd", bool);
        R6 = a("ignored_auto_redirect_schemes", tc.a(StringUtils.COMMA, new CharSequence[]{"about", "data", C4240b4.i.f42616b}));
        S6 = a("esowod", bool);
        T6 = a("sswskan", bool);
        U6 = a("rfipt", bool);
        V6 = a("config_consent_dialog_state", "unknown");
        W6 = a("country_code", "");
        X6 = a("approved_installers_for_package_name_override", "com.google.android.packageinstaller");
        Y6 = a("consent_flow_doc_url", "https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow");
        Z6 = a("consent_flow_unity_doc_url", "https://support.axon.ai/en/max/unity/overview/terms-and-privacy-policy-flow");
        f11268a7 = a("cfadtml", 20);
        f11276b7 = a("cfgcsmrc", -1);
        f11285c7 = a("cfgcsrec", String.valueOf(3));
        f11294d7 = a("enable_custom_tabs_service", bool2);
        f11303e7 = a("custom_tabs_chrome_package_names", "com.android.chrome");
        f11312f7 = a("custom_tabs_prefer_default_browser", bool2);
        f11321g7 = a("custom_tabs_animation_enabled", bool2);
        f11330h7 = a("custom_tabs_open_external_browser_on_failure", bool2);
        f11339i7 = a("gawvbu", "https://applovin.com");
        f11348j7 = a("c_sticky_topics", "safedk_init,user_info");
        f11357k7 = a("communicator_enabled", bool2);
        f11366l7 = a("adse", bool2);
    }

    public x4(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f11479a = str;
        this.f11480b = obj;
    }

    public static Collection c() {
        return DesugarCollections.synchronizedCollection(f11286d.values());
    }

    public Object a() {
        return this.f11480b;
    }

    public String b() {
        return this.f11479a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof x4)) {
            return 0;
        }
        return this.f11479a.compareTo(((x4) obj).b());
    }

    public Object a(Object obj) {
        return this.f11480b.getClass().cast(obj);
    }

    protected static x4 a(String str, Object obj) {
        if (obj != null) {
            if (f11277c.contains(obj.getClass())) {
                x4 x4Var = new x4(str, obj);
                Map map = f11286d;
                if (!map.containsKey(str)) {
                    map.put(str, x4Var);
                    return x4Var;
                }
                throw new IllegalArgumentException("Setting has already been used: " + str);
            }
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
        throw new IllegalArgumentException("No default value specified");
    }

    public static x4 a(String str) {
        return (x4) f11286d.get(str);
    }
}
