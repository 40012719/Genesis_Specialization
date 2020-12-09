
const getNumber=function(val){
    if(isNaN(val))
    return 0;
    else
    return parseFloat(val)
}
const $get=function(id)
{
return document.getElementById(id);
}
const siadd=function(p)
{
    p=getNumber(p);
    
    return p*0.25/100;

}