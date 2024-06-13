<template>
    <h1>{{ title }}</h1>
    <h2 @click="checkType">{{ num }}</h2>
    <h2>{{ num2 }}</h2>
    <h2>{{ num3 }}</h2>
</template>

<script>
export default {
    props : {
        title : {
            type : String,
            defult : "기본 제목...",
        },
        num : {
            type : Number,
            defult : 10,
        },
        num2 : {
            type : Number,
            defult : 10,
        },
        num3 : {
            type : Number,
            defult : 10,
        },
    },
    methods : {
        checkType() {
            console.log(typeof this.num);
            console.log(this.num + 200);
        }
    }
}
</script>