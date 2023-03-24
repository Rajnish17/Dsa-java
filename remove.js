function foo(nums,value){
    let newnums =[];
    for(let i=0; i<nums.length; i++){
        if(nums[i]!==value){
           newnums.push(nums[i]);
        }
    }
    return newnums;
}

let nums =[0,1,2,2,3,0,4,2];
let value =2;
console.log(foo(nums,value));