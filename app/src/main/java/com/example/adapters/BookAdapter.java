package com.example.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.listview.R;
import com.example.models.Book;

import java.util.List;

public class BookAdapter extends BaseAdapter {
    Activity context;
    int item_list;
    List<Book> bookList;

    public BookAdapter(Activity context, int item_list, List<Book> bookList) {
        this.context = context;
        this.item_list = item_list;
        this.bookList = bookList;
    }

    @Override
    public int getCount() {
        return bookList.size();
    }

    @Override
    public Object getItem(int position) {
        return bookList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            holder=new ViewHolder();
            LayoutInflater inflate =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflate.inflate(item_list,null);
            holder.imvPic=convertView.findViewById(R.id.imvPic);
            holder.txtId=convertView.findViewById(R.id.txtId);
            holder.txtName=convertView.findViewById(R.id.txtName);
            holder.txtPubC=convertView.findViewById(R.id.txtPubC);
            holder.txtRePub=convertView.findViewById(R.id.txtRePu);
            holder.txtPrice=convertView.findViewById(R.id.txtPrice);

            convertView.setTag(holder);
        }else {
            holder=(ViewHolder) convertView.getTag();
        }
        Book b=bookList.get(position);
        holder.imvPic.setImageResource(b.getBookImg());
        holder.txtId.setText(b.getBookID());
        holder.txtName.setText(b.getBookName());
        holder.txtPubC.setText(b.getBookPubC());
        holder.txtRePub.setText(b.getBookRePub());
        holder.txtPrice.setText(b.getBookPrice());

        return convertView;
    }
    private static class ViewHolder{
        ImageView imvPic;
        TextView txtId,txtName,txtPubC,txtRePub,txtPrice;
    }
}
