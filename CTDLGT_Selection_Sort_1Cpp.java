//link tham khảo:https://chidokun.github.io/2015/03/selection-sort//
int min, i, j; //min l� ch? s? ph?n t? nh? nh?t
for(i = 0; i < n-1; i++)
{
   min = i;
   for(j = i+1; j < n; j++)
      if(a[j] < a[min])
         min = j; //t�m min trong c�c ph?n t? c�n l?i
   if(min != i)
     swap(a[i], a[min]); //??i ch? n?u t�m th?y min
}

