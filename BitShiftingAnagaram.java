int main() {
    string s;
    cin>>s;

    int flag = 0;
    uint64_t mask = 0x0;
    for (int i = 0; i < s.length(); i++)
        mask = mask ^ (1 << (s[i]-'a'));
    if ((!mask) || (((mask & (mask - 1)) == 0)))
        flag = 1;
    if(flag==0)
        cout<<"NO";
    else
        cout<<"YES";
    return 0;
}
int count[]=new int[26];
        int odd=0;
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)-'a']++;
        for(int i=0;i<26;i++){
            if(count[i]%2==0)
                odd++;
        }
        if(odd>1) 
            return "NO";
        else
            return "YES";
