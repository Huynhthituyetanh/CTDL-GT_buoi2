//link tham kháº£o:https://chidokun.github.io/2015/03/selection-sort//
int min, i, j; //min là ch? s? ph?n t? nh? nh?t
for(i = 0; i < n-1; i++)
{
   min = i;
   for(j = i+1; j < n; j++)
      if(a[j] < a[min])
         min = j; //tìm min trong các ph?n t? còn l?i
   if(min != i)
     swap(a[i], a[min]); //??i ch? n?u tìm th?y min
}

