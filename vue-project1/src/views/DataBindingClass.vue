<template>
    <div class="contanier" :class="{'active' : isActive, 'text-red' : hasError}">Class Binding</div>
</template>

<script>
export default {
    data() {
        return {
            isActive : true,
            hasError : false,
        };
    }
}
</script>
<style scoped>
.contanier {
    width: 100%;
    height: 200px;
}

.active {
    background-color: yellow;
    font-weight: bold;
}

.text-red {
    color: red;
}
</style>