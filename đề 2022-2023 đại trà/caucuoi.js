let submit = document.querySelector('.subdangky')
let username= document.querySelector('#txthoten')
let cmnd = document.querySelector('#txtcmnd')
let type = document.querySelector('#cbomucgia')
let ansang = document.querySelector('#chkansang')
let giatui=document.querySelector('#chkgiatui')
let docbao = document.querySelector('#chkbaobuoisang')
let ngaythue = document.querySelector('#datengaythue')
let ngaytra = document.querySelector('#datengaytra')
let dongia = document.querySelector('.btntinhdongia')
let rent = document.querySelector('#txttienthuephong')




submit.addEventListener('click',()=>{
    if(username.value ==''){
        alert('Họ tên không được rỗng')
        username.focus()
    }else if(cmnd.value==''){
        alert('CMND không được rỗng')
        cmnd.focus()
    }else if(isNaN(cmnd.value)){
        alert('CMND phải là số')
        cmnd.focus();
    }

})

type.addEventListener('change',()=>{
    if(type.value=='b'||type.value=='c'){
        ansang.checked = true;
    }else ansang.checked = false;

})

dongia.addEventListener('click',()=>{
    let phidichvu = 0
    let songaythue = 1 
    if(type.value=='a') baseprice = 150000;
    else if(type.value=='b') baseprice = 300000;
    else if(type.value=='c') baseprice = 500000;


    if(ngaytra.value<ngaythue.value){
        alert('Ngày trả phải sau ngày thuê')
        return;
    }else if(ngaytra.value>ngaythue.value){
        let rentday = new Date(ngaythue.value)
        let checkoutday = new Date(ngaytra.value)
        songaythue = (checkoutday - rentday) / (1000*60*60*24)
    }

    if(type.value=='a'){
    if (ansang.checked && giatui.checked && docbao.checked) {
        phidichvu = baseprice * 0.15; 
    } else if (
        (ansang.checked && giatui.checked) ||
        (ansang.checked && docbao.checked) ||
        (giatui.checked && docbao.checked)
    ) {
        phidichvu = baseprice * 0.1; 
    } else if (ansang.checked || giatui.checked || docbao.checked) {
        phidichvu = baseprice * 0.05; 
    } 
    } else if(type.value=='b'|| type.value=='c'){
        if (ansang.checked && giatui.checked && docbao.checked) {
            phidichvu = baseprice * 0.1; 
        } else if (
            (ansang.checked && giatui.checked) ||
            (ansang.checked && docbao.checked) 
        ) {
            phidichvu = baseprice * 0.05; 
        } 
    }





    let tongtien = (baseprice + phidichvu)*songaythue 
    rent.value=tongtien


})



