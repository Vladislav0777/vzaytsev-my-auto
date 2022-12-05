var carApi = Vue.resource('/car{/id}');

Vue.component('car-form', {
    props: ['cars'],
    data: function (){
        return {
            text: ''
        }
    },
    template:
    '<dib>' +
        '<input type="text" placeholder="Write somthing" v-model="text"/>' +
        '<input type="button" value="Save" @click="saveCar"/>' +
    '<dib>',
    methods: {
        click: function () {
            var car = {text: this.text};

            carApi.save({}, car).then(result =>
                result.json().then(data=>{
                    this.cars.push(data)
                })
            )
        }
    }
});

Vue.component('car.row', {
    props: ['car'],
    template: '<div><i>({{car.id}})</i> {{car.text}}</div>'
});

Vue.component('cars-list', {
    props: ['cars'],
    template:
        '<div>' +
            '<car.row v-for="car in cars" :key="car.id" :car="car">{{car.text}}</car.row>' +
        '</div>'
});

var app = new Vue({
    el: '#app',
    template: '<cars-list :cars="cars"/>',
    data: {
        cars: [
            {id: "1", text: "aaaaaaaaaa"},
            {id: "2", text: "dddddddddd"},
            {id: "3", text: "hhhhhhhhhh"}
        ]
    }
});