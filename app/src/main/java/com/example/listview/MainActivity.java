package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.adapters.BookAdapter;
import com.example.listview.databinding.ActivityMainBinding;
import com.example.models.Book;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    BookAdapter adapter;
    ArrayList<Book> lvBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initData();
        loadData();
    }


    private void initData() {
        lvBooks=new ArrayList<>();
        lvBooks.add(new Book(R.drawable.truyen_mat_biec,"01","Mắt biếc","Nhà xuất bản trẻ","Số lần tái bản:04","Giá:87.000"));
        lvBooks.add(new Book(R.drawable.bongbonglentroi,"02","Bong bóng lên trời","Nhà xuất bản trẻ","Số lần tái bản:06","Giá:80.000"));
        lvBooks.add(new Book(R.drawable.ngoikhoctrencay,"03","Ngồi khóc trên cây","Nhà xuất bản trẻ","Số lần tái bản:05","Giá:90.000"));
        lvBooks.add(new Book(R.drawable.toithayhoavangtrencoxanh,"04","Tôi thấy hoa vàng trên cỏ xanh","Nhà xuất bản trẻ","Số lần tái bản:09","Giá:88.000"));
    }
    private void loadData() {
        adapter=new BookAdapter(MainActivity.this,R.layout.item_layout,lvBooks);
        binding.lvBooks.setAdapter(adapter);
    }
}