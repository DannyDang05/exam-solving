let btn1 = document.querySelector('.btn1')
let btn2 = document.querySelector('.btn2')
let btn3 = document.querySelector('.btn3')
let btn4 = document.querySelector('.btn4')
let texta = document.querySelector('#texta')
let textb = document.querySelector('#textb')
let result=document.querySelector('#kq')

btn1.addEventListener('click',()=>{
    if(texta.value==''){
        alert('Yêu cầu nhập dữ liệu')
        texta.focus();
    }else if (isNaN(texta.value)){
        alert('Vui long nhap so')
        texta.value=''
        texta.focus()
    }else if(texta.value==''){
        alert('Yêu cầu nhập dữ liệu')
        textb.focus();
    }else if(isNaN(textb.value)){
        alert('Vui long nhap so')
        textb.value=''
        textb.focus()
    }else{
        let tong = parseInt(texta.value) + parseInt(textb.value)
        result.value = tong
    }
})

btn2.addEventListener('click',()=>{
    if(texta.value==''){
        alert('Yêu cầu nhập dữ liệu')
        texta.focus();
    }else if (isNaN(texta.value)){
        alert('Vui long nhap so')
        texta.value=''
        texta.focus()
    }else if(texta.value==''){
        alert('Yêu cầu nhập dữ liệu')
        textb.focus();
    }else if(isNaN(textb.value)){
        alert('Vui long nhap so')
        textb.value=''
        textb.focus()
    }else{
        let hieu = parseInt(texta.value) - parseInt(textb.value)
        result.value = hieu
    }
})
btn3.addEventListener('click',()=>{
    if(texta.value==''){
        alert('Yêu cầu nhập dữ liệu')
        texta.focus();
    }else if (isNaN(texta.value)){
        alert('Vui long nhap so')
        texta.value=''
        texta.focus()
    }else if(texta.value==''){
        alert('Yêu cầu nhập dữ liệu')
        textb.focus();
    }else if(isNaN(textb.value)){
        alert('Vui long nhap so')
        textb.value=''
        textb.focus()
    }else{
        let tich = parseInt(texta.value) * parseInt(textb.value)
        result.value = tich
    }
})
btn4.addEventListener('click',()=>{
    if(texta.value==''){
        alert('Yêu cầu nhập dữ liệu')
        texta.focus();
    }else if (isNaN(texta.value)){
        alert('Vui long nhap so')
        texta.value=''
        texta.focus()
    }else if(texta.value==''){
        alert('Yêu cầu nhập dữ liệu')
        textb.focus();
    }else if(isNaN(textb.value)){
        alert('Vui long nhap so')
        textb.value=''
        textb.focus()
    }else{
        let thuong = parseInt(texta.value) / parseInt(textb.value)
        result.value = thuong
    }
})