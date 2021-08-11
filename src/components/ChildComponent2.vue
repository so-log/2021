<template>
    <button type="button" @click="showChildMessage" ref="child_btn">클릭</button>
</template>
<script> 
export default {
    data() {
        return {
            msg : "자식 컴포넌트 메세지",
        };
    },
    methods : {
        showChildMessage() {
            alert("자식 컴포넌트...");
        }
    }
}
</script>