let btn = document.querySelector('.btn')
let birthday = document.querySelector('#birthday')
let spanbirth = document.querySelector('.realbirth')

btn.addEventListener('click',()=>{
    xuly()

})

function xuly(){
    let birth = 2024 - birthday.value
    spanbirth.innerHTML = `${birth}`

}

