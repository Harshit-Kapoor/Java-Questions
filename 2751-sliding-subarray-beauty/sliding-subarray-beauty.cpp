class Solution {
public:
    vector<int> getSubarrayBeauty(vector<int>& nums, int k, int x) {
        int n = nums.size(),i = 0,j = 0,sz = 0;
        vector<int> ans;
        map<int,int> mp;
        while(j < n){
            if(nums[j] < 0){ 
                mp[nums[j]]++;
                sz++;
            }
            if(j-i+1 == k){
                if(sz >= x){
                    int ct = 0;
                    for(auto it:mp){
                        ct += it.second;
                        if(ct >= x){
                            ans.push_back(it.first);
                            break;
                        }
                    }
                }else{
                    ans.push_back(0);
                }
                if(nums[i] < 0){
                    mp[nums[i]]--;
                    if(mp[nums[i]] == 0) mp.erase(nums[i]);
                    sz--;
                }
                i++;
            }
			j++;
        }
        return ans;
    }
};