class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res=new int[code.length];
        if(k==0)
          return res;
        if(k>0){
            int i=1,j=k+1;
            int sum=0;
            for(int x=i;x<j;x++){
                sum+=code[x];
            }
            res[i-1]=sum;
            for(int x=0;x<code.length-1;x++){
                sum-=code[i%code.length];
                sum+=code[j%code.length];
                res[i]=sum;
                i++;
                j++;
            }
            return res;
        }
        int K=-k;
        int i=K,j=0;
        int sum=0;
        for(int x=j;x<i;x++){
            sum+=code[x];
        }
        res[i]=sum;
        for(int x=0;x<code.length-1;x++){
            i--;
            j--;
            sum-=code[(code.length+i)%code.length];
            sum+=code[(code.length+j)%code.length];
            res[(code.length+i)%code.length]=sum;
        }
        return res;
    }
}

class Solution2 {
  public int[] decrypt(int[] code, int k) {

    int[] result = new int[code.length];
    if (k == 0) {
      return result;
    }

    for (int i = 0; i < result.length; i++) {

      if (k > 0) {

        for (int j = i + 1; j < i + k + 1; j++) {
          result[i] += code[j % code.length];
        }

      }

      else {
        for (int j = i - Math.abs(k); j < i; j++) {
          result[i] += code[(j + code.length) % code.length];
        }
      }

    }
    return result;
  }
}