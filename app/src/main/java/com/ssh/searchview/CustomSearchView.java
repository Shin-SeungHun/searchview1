package com.ssh.searchview;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.SearchView;

public class CustomSearchView extends SearchView {

    public CustomSearchView(Context context) {
        super(context);
        init();
    }

    public CustomSearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setIconifiedByDefault(false); // 검색창이 항상 열려있도록 설정
    }
}