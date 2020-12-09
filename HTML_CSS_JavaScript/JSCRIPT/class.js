class employee{
    constructor(id,name,address)
    {
        this.empId=id;
        this.empName=name;
        this.empAdd=address;
    }
    display()
    {
        alert("the name is"+this.empName)
        alert("the id is"+this.empId)
        alert("the add is"+this.empAdd)
    }
}
const empObj= new employee(21,"sandy","Tamil nadu");
console.log(empObj);
console.log(JSON.stringify(empObj));//data in string format