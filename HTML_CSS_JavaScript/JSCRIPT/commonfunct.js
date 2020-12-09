const getNumber=function(v1){
    if(isNaN(v1))
    {
        return 0;
    }
    else
    {
        return parseFloat(v1);
    }
}
const sub=function(v1,v2)
{
    return v1-v2;
}
const mul=function(v1,v2)
{

    return v1*v2;
}
const div=function(v1,v2)
{

    return v1/v2;
}
const add=function(v1,v2)
{
    v1=getNumber(v1);
    v2=getNumber(v2);
    return v1+v2;
}
const $get=function(id)
{
    return document.getElementById(id);
}